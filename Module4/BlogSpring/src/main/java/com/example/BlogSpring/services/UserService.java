package com.example.BlogSpring.services;

import com.example.BlogSpring.jpaRepo.BlogRepo;
import com.example.BlogSpring.jpaRepo.UserRepo;
import com.example.BlogSpring.models.Blog;
import com.example.BlogSpring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    @PersistenceContext
    private EntityManager em;

    private PasswordEncoder encoder;

    @Autowired
    UserRepo userRepo;


    @Autowired
    public UserService(PasswordEncoder encoder) {
        this.encoder = encoder;
    }


    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return em.createQuery("SELECT user FROM User user WHERE user.username = :name", User.class)
                .setParameter("name", username)
                .getSingleResult();
    }

    public User getLoggedInUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth != null) {
            Object principal = auth.getPrincipal();
            if (principal instanceof User) {
                return (User) principal;
            }
        }

        return null;
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();

    }

    public Optional<User> getOneUser(long id) {
        return userRepo.findById(id);

    }

    public User register(User newUser) {
        for(int i = 0; i < userRepo.findAll().size();i++){
            if(newUser.getUsername().equals(userRepo.findAll().get(i).getUsername())){
                return null;
            }
        }
        newUser.setPassword(encoder.encode(newUser.getPassword()));
		return userRepo.save(newUser);
	}



    // TODO blogokra ugyan ezek



}

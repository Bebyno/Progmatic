package com.example.BlogSpring.jpaRepo;

import com.example.BlogSpring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}

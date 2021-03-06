package com.example.BlogSpring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .formLogin()
                .and()
                .logout()
                .and()
                .authorizeRequests()
                //   .antMatchers("/**",).permitAll();
                .antMatchers("/", "/home", "/register").permitAll()
                .antMatchers("/users").hasAuthority("CREATE_ALL")
                .antMatchers("/blogs").hasAuthority("CREATE");


                /* own data check :

                @Component("userSecurity")
                public class UserSecurity {

                public boolean hasUserId(Authentication authentication, Long userId) {
            // do your check(s) here
        }
    }

                .antMatchers("/users/{userId}/**")
                .access("@userSecurity.hasUserId(authentication,#userId)");*/


    }

}
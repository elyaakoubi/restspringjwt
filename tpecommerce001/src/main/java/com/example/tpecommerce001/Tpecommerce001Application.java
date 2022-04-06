package com.example.tpecommerce001;

import com.example.tpecommerce001.repositories.AppUserRepository;
import com.example.tpecommerce001.security.AppUser;
import com.example.tpecommerce001.servies.IaccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class Tpecommerce001Application implements CommandLineRunner {

    @Autowired
    IaccountService accountService;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {
        SpringApplication.run(Tpecommerce001Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*AppUser appuser = AppUser.builder().
                username("admin")
                .password("admin")
                .roles(new ArrayList<>())
                .build();
        accountService.saveUser(appuser);

        AppUser appuser2 = AppUser.builder().
                username("mohamed")
                .password("mohamed")
                .roles(new ArrayList<>())
                .build();
        accountService.saveUser(appuser2);
*/

    }
}

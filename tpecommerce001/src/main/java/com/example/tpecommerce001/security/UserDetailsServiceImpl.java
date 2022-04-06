package com.example.tpecommerce001.security;


import com.example.tpecommerce001.servies.AccountService;
import com.example.tpecommerce001.servies.IaccountService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
@Primary
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    IaccountService acountService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser u = acountService.findUserByUsername(username);
        if(u==null) throw new UsernameNotFoundException(username);
        Collection<GrantedAuthority> authorities=new ArrayList<>();
        u.getRoles().forEach(r->{
            authorities.add(new SimpleGrantedAuthority(r.getRole().getRole()));
        });
        return new User(u.getUsername(), u.getPassword(), authorities);
    }



}


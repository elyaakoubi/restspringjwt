package com.example.tpecommerce001.servies;

import com.example.tpecommerce001.security.AppRole;
import com.example.tpecommerce001.security.AppUser;
import com.example.tpecommerce001.security.Role;

public interface IaccountService {
    public AppUser findUserByUsername(String username);
    public AppUser saveUser(AppUser user);
    public AppRole saveRole(AppRole r);
    public void addRoleToUser(String username, Role r);



}

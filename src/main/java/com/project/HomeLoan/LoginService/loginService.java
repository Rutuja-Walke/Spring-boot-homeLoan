package com.project.HomeLoan.LoginService;

import com.project.HomeLoan.LoginDomain.Users;
import com.project.HomeLoan.LoginRepository.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class loginService {
    @Autowired
    private LoginRepository repo;

    public Users login(String email, String pswd) {
        Users user = repo.findByUsernameAndPassword(email, pswd);
        return user;
    }

}
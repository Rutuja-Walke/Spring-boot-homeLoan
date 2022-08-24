package com.project.HomeLoan.LoginRepository;

import com.project.HomeLoan.LoginDomain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginRepository extends JpaRepository<Users, Long>{
    Users findByUsernameAndPassword(String email, String password);

}
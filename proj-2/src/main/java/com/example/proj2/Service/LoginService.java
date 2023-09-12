package com.example.proj2.Service;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proj2.Model.LoginModel;

public interface LoginService extends JpaRepository<LoginModel,Integer>{

}
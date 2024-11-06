package com.validation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validation.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}

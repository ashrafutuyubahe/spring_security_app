package com.spring_security.spring_security.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_security.spring_security.Entity.User;

public interface UserRepository  extends JpaRepository<User,Long>{
    List<User> findAll();
    User findUserById(int id);
    User findByName( String userName);
    User findByEmail(String userEmail);
    


}

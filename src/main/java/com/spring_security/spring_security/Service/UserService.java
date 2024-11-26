package com.spring_security.spring_security.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring_security.spring_security.Entity.User;
import com.spring_security.spring_security.Repository.UserRepository;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.var;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    private String encryptPassword(String password) {
        return new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder().encode(password);
    }

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;

    }

    public String UserRegisterService(User user) {

        if (user == null || user.getEmail() == null || user.getPassword() == null || user.getUsername() == null) {
            throw new IllegalArgumentException("Incomplete fields, PLease  provide all fields");
        }

        var userExists = userRepository.findByEmail(user.getEmail());

        if (userExists != null) {
            throw new IllegalArgumentException("user Already Exists");
        }

        String userEncryptedPassword = encryptPassword(user.getPassword());
        user.setPassword(userEncryptedPassword);
        
        user.setPassword(userEncryptedPassword);

        userRepository.save(user);

        return " you are have  successfully  registered";

    }

    public String userLoginService(String userEmail, String userPassword) {

        if (userEmail == null || userPassword == null) {
            throw new IllegalArgumentException("pleae  provide all fields");
        }

        User UserExists = userRepository.findByEmail(userEmail);
        

        if (UserExists == null) {
            throw new IllegalArgumentException("User not found.");
        }
        if (!passwordEncoder.matches(userPassword, UserExists.getPassword())) {
            throw new IllegalArgumentException("Invalid email or password");

        }
      return generateToken(UserExists);

    }



    @SuppressWarnings("deprecation")
    public String generateToken(User user){

          String secreteKey= "My_secrete";
          long expiredDuration= 360000l;

          return Jwts.builder()
          .setSubject(user.getEmail())
          .claim("userName", user.getUsername()) 
          .claim("roles", "USER") 
          .setIssuedAt(new Date())
          .setExpiration(new Date(System.currentTimeMillis() + expiredDuration))
          .signWith(SignatureAlgorithm.HS512, secreteKey)
          .compact();
 

    }

}

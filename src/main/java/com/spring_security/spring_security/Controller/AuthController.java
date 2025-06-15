package com.spring_security.spring_security.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.spring_security.spring_security.Dto.LoginDto;
import com.spring_security.spring_security.Dto.LoginResponseDto;
import com.spring_security.spring_security.Dto.RegisterDto;
import com.spring_security.spring_security.serviceImpl.AuthServiceImpl;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("clinic-mngs-v2/api/v1/auth") 
public class AuthController {

    private final AuthServiceImpl authServiceImpl;

    @Autowired
    public AuthController(AuthServiceImpl authServiceImpl) {
        this.authServiceImpl = authServiceImpl;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterDto registerDto) {
        String response = authServiceImpl.registerUser(registerDto);
        System.out.println(registerDto);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginDto loginDto) {
        LoginResponseDto response = authServiceImpl.loginUser(loginDto);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/user_endpoint")
    @PreAuthorize("hasRole('USER') ')")
    public ResponseEntity<String> userEndpoint() {
        return ResponseEntity.ok("This is  protected resource for USER role");
    }

    @GetMapping("/admin_endpoint")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> adminEndpoint() {
        return ResponseEntity.ok("This is not protected for ADMIN role");
    }
}

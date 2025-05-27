package com.spring_security.spring_security.Service;

import com.spring_security.spring_security.Dto.LoginDto;
import com.spring_security.spring_security.Dto.LoginResponseDto;
import com.spring_security.spring_security.Dto.RegisterDto;

public interface AuthService {
    String registerUser(RegisterDto registerDto);
    LoginResponseDto loginUser(LoginDto loginDto);
    String logoutrUser();
    // void requestPasswordReset(String email);
    // boolean verifyResetCode(String email, String code);
    // void resetPassword(String email, String newPassword);
}

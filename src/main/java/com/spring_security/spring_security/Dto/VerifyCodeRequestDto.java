package com.spring_security.spring_security.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Setter
//@Getter
public class VerifyCodeRequestDto {

    private String email;
    private String code;
}


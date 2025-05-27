package com.spring_security.spring_security.Dto;

import lombok.Data;

@Data
public class UpdatePatientDTO {
    private String fullName;
    private int age;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private String disease;
    private String medication;
}

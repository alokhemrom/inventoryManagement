package com.telusko.SecurityEx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDto {
    private String username;
    private String password;
    private String companyName;
    private String capacity;
    private String location;
}

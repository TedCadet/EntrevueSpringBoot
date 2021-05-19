package com.example.entrevueSpringBoot.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurDTO {
    private long userId;
    private String username;
    private String password;
}

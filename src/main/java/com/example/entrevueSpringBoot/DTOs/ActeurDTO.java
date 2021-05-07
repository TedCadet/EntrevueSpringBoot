package com.example.entrevueSpringBoot.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActeurDTO {
    private long id;
    private String nom;
    private String prenom;
}

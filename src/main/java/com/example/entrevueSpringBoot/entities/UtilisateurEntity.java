package com.example.entrevueSpringBoot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Utilisateurs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurEntity {
    @Id
    @GeneratedValue
    private long userId;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String password;
}

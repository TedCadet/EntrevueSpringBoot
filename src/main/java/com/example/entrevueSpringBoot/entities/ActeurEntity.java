package com.example.entrevueSpringBoot.entities;

import lombok.*;

import javax.persistence.*;

/*
    Modele de l'object Acteur
    elle contient un id pour l'identifier, le nom de famille et le prenom de l'acteur
    l'annotation Data de Lombok genere le constructeur et les getters
 */


@Entity
@Table(name = "acteurs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActeurEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

}

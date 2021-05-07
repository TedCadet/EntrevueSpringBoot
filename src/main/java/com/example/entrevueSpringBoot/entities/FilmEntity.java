package com.example.entrevueSpringBoot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/*
    Modele de l'object Film
    elle contient un id pour l'identifier, un titre, une description et la liste des acteurs du film
    l'annotation Data de Lombok genere le constructeur et les getters
 */

@Entity
@Table(name = "films")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    @Column(nullable = false)
    private  String titre;
    @Column(nullable = false)
    private  String description;
    @Column(nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private  List<ActeurEntity> acteurs;


}

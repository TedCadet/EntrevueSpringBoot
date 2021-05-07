package com.example.entrevueSpringBoot.DTOs;

import com.example.entrevueSpringBoot.entities.ActeurEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmDTO {
    private  long id;
    private  String titre;
    private  String description;
    private List<ActeurEntity> acteurs;
}

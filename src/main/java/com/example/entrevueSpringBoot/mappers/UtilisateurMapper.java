package com.example.entrevueSpringBoot.mappers;

import com.example.entrevueSpringBoot.DTOs.UtilisateurDTO;
import com.example.entrevueSpringBoot.entities.UtilisateurEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {
    // Retourne une instance du mapper et donne access a l'implementation du mapper aux clients
    UtilisateurMapper INSTANCE = Mappers.getMapper(UtilisateurMapper.class);

    // prend un dto en entree et retourne l'entite qui le correspond
    UtilisateurEntity fromDto(UtilisateurDTO utilisateurDto);

    // prend une entite en entree et retourne le dto qui le correspond
    UtilisateurDTO toDto(UtilisateurEntity utilisateurEntity);

}

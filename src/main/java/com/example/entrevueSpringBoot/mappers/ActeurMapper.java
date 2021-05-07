package com.example.entrevueSpringBoot.mappers;


import com.example.entrevueSpringBoot.DTOs.ActeurDTO;
import com.example.entrevueSpringBoot.entities.ActeurEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ActeurMapper {
    
    // Retourne une instance du mapper et donne accès à l'implémentation du mapper aux clients
    ActeurMapper INSTANCE = Mappers.getMapper(ActeurMapper.class);

    // prend un dto en entrée et retourne l'entité qui le correspond
    ActeurEntity fromDto(ActeurDTO ActeurDto);

    // prend une entité en entrée et retourne le dto qui le correspond
    @InheritInverseConfiguration
    ActeurDTO toDto(ActeurEntity ActeurEntity);
}

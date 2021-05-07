package com.example.entrevueSpringBoot.mappers;


import com.example.entrevueSpringBoot.DTOs.ActeurDTO;
import com.example.entrevueSpringBoot.entities.ActeurEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ActeurMapper {
    
    // Retourne une instance du mapper et donne access a l'implementation du mapper aux clients
    ActeurMapper INSTANCE = Mappers.getMapper(ActeurMapper.class);

    // prend un dto en entree et retourne l'entite qui le correspond
    ActeurEntity fromDto(ActeurDTO ActeurDto);

    // prend une entite en entree et retourne le dto qui le correspond
    @InheritInverseConfiguration
    ActeurDTO toDto(ActeurEntity ActeurEntity);
}

package com.example.entrevueSpringBoot.mappers;

import com.example.entrevueSpringBoot.DTOs.FilmDTO;
import com.example.entrevueSpringBoot.entities.FilmEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface FilmMapper {
    // Retourne une instance du mapper et donne access a l'implementation du mapper aux clients
    FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);

    // prend un dto en entree et retourne l'entite qui le correspond
    FilmEntity fromDto(FilmDTO filmDto);

    // prend une entite en entree et retourne le dto qui le correspond
    FilmDTO toDto(FilmEntity filmEntity);

    // prend un iterable de dto et le transforme en un iterable d'entite
    Iterable<FilmEntity> getFilmsFromDto(Iterable<FilmDTO> filmDtos);

    // prend une liste d'entite et le transforme en un iterable de dto
    Iterable<FilmDTO> getFilmsToDto(Iterable<FilmEntity> filmEntities);
}

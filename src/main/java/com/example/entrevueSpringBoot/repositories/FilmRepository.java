package com.example.entrevueSpringBoot.repositories;

import com.example.entrevueSpringBoot.entities.FilmEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<FilmEntity, Long> {
}

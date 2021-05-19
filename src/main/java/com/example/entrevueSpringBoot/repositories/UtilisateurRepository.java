package com.example.entrevueSpringBoot.repositories;

import com.example.entrevueSpringBoot.entities.UtilisateurEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
    interface qui contient les methodes CRUD (Create, Read, Update, Delete)
 */
@Repository
public interface UtilisateurRepository extends CrudRepository<UtilisateurEntity, Long> {
    Optional<UtilisateurEntity> findByUsername(String username);
}

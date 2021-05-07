package com.example.entrevueSpringBoot.repositories;

import com.example.entrevueSpringBoot.entities.ActeurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActeurRepository extends JpaRepository<ActeurEntity, Long> {
}

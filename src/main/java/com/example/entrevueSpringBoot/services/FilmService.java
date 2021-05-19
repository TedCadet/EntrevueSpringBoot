package com.example.entrevueSpringBoot.services;

import com.example.entrevueSpringBoot.entities.FilmEntity;
import com.example.entrevueSpringBoot.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
    FilmService va gérer les méthodes CRUD (Create, Read, Update, Delete)
    Elle reçoit comme argument par injection filmRepository qui est une interface contenant les méthodes CRUD
 */
@RequiredArgsConstructor
@Service
public class FilmService {
    private final FilmRepository filmRepository;

    /*
        trouve un film grâce à son id dans la db
        arg: l'id du film
        return: le film ou une valeur null
     */
    public Optional<FilmEntity> findById(Long id) {
        return filmRepository.findById(id);
    }

    /*
        trouve tous les films
        return: tous les films de la bd
     */
    public Iterable<FilmEntity> findAll() { return filmRepository.findAll(); }

    /*
        enregistre un film dans la db
        arg: un filmEntity qui se retrouvera dans la db
        return: un FilmEntity
     */
    public FilmEntity save(FilmEntity film) {
        return filmRepository.save(film);
    }
}

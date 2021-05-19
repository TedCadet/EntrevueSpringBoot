package com.example.entrevueSpringBoot.controllers;

import com.example.entrevueSpringBoot.DTOs.FilmDTO;
import com.example.entrevueSpringBoot.Exceptions.FilmNotFoundException;
import com.example.entrevueSpringBoot.entities.FilmEntity;
import com.example.entrevueSpringBoot.mappers.FilmMapper;
import com.example.entrevueSpringBoot.services.FilmService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


/*
    Controller du api de Film

    arg1: une injection d'un FilmService qui gèrera les méthodes CRUD
    arg2: une injection de FilmMapper qui sera implémenter au build. Il va gérer la transformation entre
        FilmEntity et DTO
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("api/film")
public class FilmController {

    private final FilmService filmService;
    private final FilmMapper filmMapper;


    /*
        GET method pour obtenir tous les films
        TODO: throw une erreur si il n'y a pas de films
     */
    @GetMapping("")
    public ResponseEntity<Iterable<FilmDTO>> findAll() {
        Iterable<FilmEntity> films = filmService.findAll();
        return ResponseEntity.ok(filmMapper.getFilmsToDto(films));
    }

    /* GET methode pour obtenir un  film par son id
        arg: id du film retrouvé dans le url
     */
    @GetMapping("/{id}")
    public ResponseEntity<FilmDTO> findById(@PathVariable Long id) throws FilmNotFoundException {
        // cherche le film avec son id, Optional va contenir le film ou un objet Null
        Optional<FilmEntity> film = filmService.findById(id);

        // throw une exception FilmNotFoundException si le film n'est pas présent
        if(!film.isPresent()) {
            throw new FilmNotFoundException(id);
        }

        // retourne une réponse 200 ok si l'objet film est présent dans la db
        //  ou une réponse 500 si il y a une erreur
        return ResponseEntity.ok(filmMapper.toDto(film.get()));
    }

    /* POST methode pour rajouter un film dans la db
        arg: le corps de la requête contenant le film
     */
    @PostMapping
    public ResponseEntity<FilmDTO> create(@RequestBody FilmDTO filmDTO) {
        // enregistre le film
        filmService.save(filmMapper.fromDto(filmDTO));

        // retourne une réponse 201 si le film a bien été rajouté dans la bd
        //  ou une réponse 500 si il y a une erreur
        return ResponseEntity.status(HttpStatus.CREATED).body(filmDTO);
    }




}

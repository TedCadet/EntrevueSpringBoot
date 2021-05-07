package com.example.entrevueSpringBoot.controllers;

import com.example.entrevueSpringBoot.DTOs.FilmDTO;
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



@RequiredArgsConstructor
@RestController
@RequestMapping("api/film")
public class FilmController {

    private final FilmService filmService;
    private final FilmMapper filmMapper;

    // GET methode pour obtenir un  film par son id
    @GetMapping("/{id}")
    public ResponseEntity<FilmDTO> findById(@PathVariable Long id) {
        Optional<FilmEntity> film = filmService.findById(id);

        return ResponseEntity.ok(filmMapper.toDto(film.get()));
    }

    // POST methode pour rajouter un film dans la db
    @PostMapping
    public ResponseEntity<FilmDTO> create(@RequestBody FilmDTO filmDTO) {
        filmService.save(filmMapper.fromDto(filmDTO));

        return ResponseEntity.status(HttpStatus.CREATED).body(filmDTO);
    }




}

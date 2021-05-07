package com.example.entrevueSpringBoot.services;

import com.example.entrevueSpringBoot.entities.FilmEntity;
import com.example.entrevueSpringBoot.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FilmService {
    private final FilmRepository filmRepository;

    public Optional<FilmEntity> findById(Long id) {
        return filmRepository.findById(id);
    }

    public FilmEntity save(FilmEntity film) {
        return filmRepository.save(film);
    }
}

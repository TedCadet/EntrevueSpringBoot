package com.example.entrevueSpringBoot.Exceptions;

public class FilmNotFoundException extends RuntimeException{


    FilmNotFoundException(String msg) {
        super(msg);
    }

    FilmNotFoundException(Long id) {
        super("Could not find film " + id);
    }
}

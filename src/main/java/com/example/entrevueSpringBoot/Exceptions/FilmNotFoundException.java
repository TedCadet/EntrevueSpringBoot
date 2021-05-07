package com.example.entrevueSpringBoot.Exceptions;

public class FilmNotFoundException extends RuntimeException{


    public FilmNotFoundException(String msg) {
        super(msg);
    }

    public FilmNotFoundException(Long id) {
        super("Could not find film " + id);
    }
}

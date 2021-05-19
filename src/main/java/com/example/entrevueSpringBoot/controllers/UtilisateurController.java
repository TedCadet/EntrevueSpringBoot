package com.example.entrevueSpringBoot.controllers;

import com.example.entrevueSpringBoot.DTOs.UtilisateurDTO;
import com.example.entrevueSpringBoot.entities.UtilisateurEntity;
import com.example.entrevueSpringBoot.mappers.UtilisateurMapper;
import com.example.entrevueSpringBoot.services.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/utilisateur")
public class UtilisateurController {

    private final UtilisateurMapper utilisateurMapper;
    private final UtilisateurService utilisateurService;

    /*
        POST method pour creer un nouvel utilisateur
        arg: le corps de la requête contenant l'utilisateur
     */
    @PostMapping
    ResponseEntity<UtilisateurDTO> create(@RequestBody UtilisateurDTO utilisateurDTO) {
        // enregistre l'utilisateur
        utilisateurService.save(utilisateurMapper.fromDto(utilisateurDTO));

        // retourne une réponse 201 si le film a bien été rajouté dans la bd
        //  ou une réponse 500 si il y a une erreur
        return ResponseEntity.status(HttpStatus.CREATED).body(utilisateurDTO);
    }

    /*
        GET method pour retrouver un utilisateur dans la bd
        arg: le id se trouvant dans la requete
     */
    @GetMapping("/id/{id}")
    ResponseEntity<UtilisateurDTO> findById(@PathVariable Long id) {
        // cherche l'utilisateur avec son id, Optional va contenir l'utilisateur ou un objet Null
        Optional<UtilisateurEntity> utilisateur = utilisateurService.findById(id);

        // retourne une réponse 200 si l'utilisateur existe
        //  ou une réponse 500 si il y a une erreur
        return ResponseEntity.ok(utilisateurMapper.toDto(utilisateur.get()));
    }

    /*
        GET method pour retrouver un utilisateur dans la bd
        arg: le username se trouvant dans la requete
     */
    @GetMapping("/username/{username}")
    ResponseEntity<UtilisateurDTO> findByUsername(@PathVariable String username) {
        // cherche l'utilisateur avec son username, Optional va contenir l'utilisateur ou un objet Null
        Optional<UtilisateurEntity> utilisateur = utilisateurService.findByUsername(username);

        // retourne une réponse 200 si l'utilisateur existe
        //  ou une réponse 500 si il y a une erreur
        return ResponseEntity.ok(utilisateurMapper.toDto(utilisateur.get()));
    }
}

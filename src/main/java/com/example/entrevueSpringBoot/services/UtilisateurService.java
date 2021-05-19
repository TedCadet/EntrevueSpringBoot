package com.example.entrevueSpringBoot.services;

import com.example.entrevueSpringBoot.entities.UtilisateurEntity;
import com.example.entrevueSpringBoot.repositories.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;

    /*
        enregistre un utilisateur dans la db
        arg: un utilisateurEntity qui se retrouvera dans la db
        return: un utilisateurEntity
     */
    public UtilisateurEntity save(UtilisateurEntity utilisateurEntity) { return utilisateurRepository.save(utilisateurEntity); }

    /*
        trouve un utlisateur par son id dans la db
        arg: l'id de l'utilisateur
        return: l'utilisateur ou une valeur null
     */
    public Optional<UtilisateurEntity> findById(Long id) { return utilisateurRepository.findById(id); }

    /*
        trouve un utilisateur par son username
        arg: le username
        return: l'utilisateur
     */
    public Optional<UtilisateurEntity> findByUsername(String username) { return utilisateurRepository.findByUsername(username); }

}

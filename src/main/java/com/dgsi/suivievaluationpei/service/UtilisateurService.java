package com.dgsi.suivievaluationpei.service;

import com.dgsi.suivievaluationpei.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur addUtilisateur(Utilisateur utilisateur);
    List<Utilisateur> findALLUtilisateur();
    Utilisateur updateUtilisateur(Utilisateur utilisateur);
    void deleteUtilisateurById(Long id);
}

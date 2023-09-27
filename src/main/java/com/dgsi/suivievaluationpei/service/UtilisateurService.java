package com.dgsi.suivievaluationpei.service;

import com.dgsi.suivievaluationpei.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur addUtilisateur(Utilisateur utilisateur);
    List<Utilisateur> findALLUtilisateur();
    Utilisateur updateUtilisateur(Utilisateur utilisateur);
    boolean deleteUtilisateurById(Long id);
    Utilisateur findUtilisateurById(Long id);
}

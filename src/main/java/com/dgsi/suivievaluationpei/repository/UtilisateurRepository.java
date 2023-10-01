package com.dgsi.suivievaluationpei.repository;

import com.dgsi.suivievaluationpei.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findByUtilisateurId(Long utilisateurId);
     Optional<Utilisateur> findByEmail(String email);
     Utilisateur findByNomContaining(String nom);
}

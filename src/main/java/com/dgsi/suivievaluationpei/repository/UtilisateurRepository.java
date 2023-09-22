package com.dgsi.suivievaluationpei.repository;

import com.dgsi.suivievaluationpei.model.Structure;
import com.dgsi.suivievaluationpei.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findUtilisateurByutilisateurId(Long utilisateurId);
    // Utilisateur findByStructure(Long utilisateurId);
}

package com.dgsi.suivievaluationpei.service.implementation;

import com.dgsi.suivievaluationpei.model.Utilisateur;
import com.dgsi.suivievaluationpei.repository.UtilisateurRepository;
import com.dgsi.suivievaluationpei.service.UtilisateurService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class UtilisateurServiceImpl implements UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {

        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> findALLUtilisateur() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void deleteUtilisateurById(Long id) {
         utilisateurRepository.deleteById(id);
    }
}
package com.dgsi.suivievaluationpei.service.implementation;

import com.dgsi.suivievaluationpei.model.Role;
import com.dgsi.suivievaluationpei.model.Utilisateur;
import com.dgsi.suivievaluationpei.repository.RoleRepository;
import com.dgsi.suivievaluationpei.repository.UtilisateurRepository;
import com.dgsi.suivievaluationpei.service.UtilisateurService;
import jdk.jshell.execution.Util;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class UtilisateurServiceImpl implements UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;
    private final RoleRepository roleRepository;
    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
    String nomUtilisateur = utilisateur.getNom() + utilisateur.getPrenom();
    utilisateur.setNomUtilisateur(nomUtilisateur);
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
    public boolean deleteUtilisateurById(Long id) {
       return  false ;
    }

    @Override
    public Utilisateur findUtilisateurById(Long id) {
        return utilisateurRepository.findByUtilisateurId(id).orElseThrow();
    }

    public Utilisateur findByEmail(String email){
        return  utilisateurRepository.findByEmail(email).orElseThrow();
    }
    public Utilisateur findById(Long id){
        return utilisateurRepository.findByUtilisateurId(id).orElseThrow();
    }
}

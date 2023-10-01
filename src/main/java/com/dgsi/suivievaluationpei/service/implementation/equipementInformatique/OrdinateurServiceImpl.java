package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Ordinateur;
import com.dgsi.suivievaluationpei.repository.typeEquipement.OrdinateurRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.OrdinateurService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class OrdinateurServiceImpl implements OrdinateurService {
    private final OrdinateurRepository ordinateurRepository;
    @Override
    public Ordinateur addOrdinateur(Ordinateur ordinateur) {
        return ordinateurRepository.save(ordinateur);
    }

    @Override
    public List<Ordinateur> getAllOrdinateur() {
        return ordinateurRepository.findAll();
    }

    @Override
    public Ordinateur updateOrdinateur(Long id, Ordinateur ordinateur) {
        ordinateurRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        ordinateur.setEquipementId(id);
        return ordinateurRepository.save(ordinateur);
    }

    @Override
    public  boolean deleteOrdinateur(Long id) {
        Ordinateur ordinateur = ordinateurRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        ordinateurRepository.delete(ordinateur);
        return true;
    }
}

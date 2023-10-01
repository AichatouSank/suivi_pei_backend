package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Routeur;
import com.dgsi.suivievaluationpei.repository.typeEquipement.RouteurRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.RouteurService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class RouteurServiceImpl implements RouteurService {
    private final RouteurRepository routeurRepository;
    @Override
    public Routeur addRouteur(Routeur routeur) {
        return routeurRepository.save(routeur);
    }

    @Override
    public List<Routeur> getAllRouteur() {
        return routeurRepository.findAll();
    }

    @Override
    public Routeur updateRouteur(Long id, Routeur routeur) {
        routeurRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        routeur.setEquipementId(id);
        return routeurRepository.save(routeur);
    }

    @Override
    public boolean deleteRouteur(Long id) {
        Routeur routeur = routeurRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        routeurRepository.delete(routeur);
        return true;
    }
}

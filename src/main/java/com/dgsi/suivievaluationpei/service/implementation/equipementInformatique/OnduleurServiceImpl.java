package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Onduleur;
import com.dgsi.suivievaluationpei.repository.typeEquipement.OnduleurRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.OnduleurService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class OnduleurServiceImpl implements OnduleurService {
    private final OnduleurRepository onduleurRepository;
    @Override
    public Onduleur addOnduleur(Onduleur onduleur) {
        return onduleurRepository.save(onduleur);
    }

    @Override
    public List<Onduleur> getAllOnduleur() {
        return onduleurRepository.findAll();
    }

    @Override
    public Onduleur updateOnduleur(Long id, Onduleur onduleur) {
        onduleurRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        onduleur.setEquipementId(id);
        return onduleurRepository.save(onduleur);
    }

    @Override
    public boolean deleteOnduleur(Long id) {
        Onduleur onduleur = onduleurRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        onduleurRepository.delete(onduleur);
        return true;
    }
}

package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Traceur;
import com.dgsi.suivievaluationpei.repository.typeEquipement.TraceurRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.TraceurService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class TraceurServiceImpl implements TraceurService {
    private final TraceurRepository traceurRepository;
    @Override
    public Traceur addTraceur(Traceur traceur) {
        return traceurRepository.save(traceur);
    }

    @Override
    public List<Traceur> getAllTraceur() {
        return traceurRepository.findAll();
    }

    @Override
    public Traceur updateTraceur(Long id, Traceur traceur) {
        traceurRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        traceur.setEquipementId(id);
        return traceurRepository.save(traceur);
    }

    @Override
    public boolean deleteTraceur(Long id) {
        Traceur traceur = traceurRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id + " invalide"));
         traceurRepository.delete(traceur);
         return true;
    }
}

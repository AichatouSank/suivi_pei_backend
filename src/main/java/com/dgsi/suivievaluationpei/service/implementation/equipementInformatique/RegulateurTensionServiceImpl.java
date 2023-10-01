package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.RegulateurTension;
import com.dgsi.suivievaluationpei.repository.typeEquipement.RegulateurTensionRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.RegulateurTensionService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class RegulateurTensionServiceImpl implements RegulateurTensionService {
    private final RegulateurTensionRepository regulateurTensionRepository;
    @Override
    public RegulateurTension addRegulateurTension(RegulateurTension regulateurTension) {

        return regulateurTensionRepository.save(regulateurTension) ;
    }

    @Override
    public List<RegulateurTension> getAllRegulateurTension() {
        return regulateurTensionRepository.findAll();
    }

    @Override
    public RegulateurTension updateRegulateurTension(Long id, RegulateurTension regulateurTension) {
        regulateurTensionRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "id :" +id +" incorrect"));
        regulateurTension.setEquipementId(id);
        return regulateurTensionRepository.save(regulateurTension);
    }

    @Override
    public boolean deleteRegulateurTension(Long id) {
        RegulateurTension regulateurTension = regulateurTensionRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
            regulateurTensionRepository.delete(regulateurTension);
        return true;
    }
}

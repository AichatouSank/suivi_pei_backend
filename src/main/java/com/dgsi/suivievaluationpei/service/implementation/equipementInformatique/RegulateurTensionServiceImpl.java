package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.RegulateurTension;
import com.dgsi.suivievaluationpei.service.equipementInformatique.RegulateurTensionService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class RegulateurTensionServiceImpl implements RegulateurTensionService {
    @Override
    public RegulateurTension addRegulateurTension(RegulateurTension regulateurTension) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllRegulateurTension() {
        return null;
    }

    @Override
    public RegulateurTension updateRegulateurTension(RegulateurTension regulateurTension) {
        return null;
    }

    @Override
    public String deleteRegulateurTension(Long id) {
        return null;
    }
}

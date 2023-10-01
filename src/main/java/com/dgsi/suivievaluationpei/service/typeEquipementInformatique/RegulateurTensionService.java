package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.RegulateurTension;

import java.util.List;

public interface RegulateurTensionService {
    RegulateurTension addRegulateurTension(RegulateurTension regulateurTension);
    List<RegulateurTension> getAllRegulateurTension();

    RegulateurTension updateRegulateurTension(Long id, RegulateurTension regulateurTension);

    boolean deleteRegulateurTension(Long id);
}

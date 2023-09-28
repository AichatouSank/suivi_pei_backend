package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.RegulateurTension;

import java.util.List;

public interface RegulateurTensionService {
    RegulateurTension addRegulateurTension(RegulateurTension regulateurTension);
    List<RegulateurTension> getAllRegulateurTension();
    RegulateurTension updateRegulateurTension(RegulateurTension regulateurTension);
    boolean deleteRegulateurTension(Long id);
}

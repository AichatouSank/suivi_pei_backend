package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Serveur;

import java.util.List;

public interface ServeurService {
    Serveur addServeur(Serveur serveur);
    List<EquipementInformatique> getAllServeur();
    Serveur updateServeur(Serveur serveur);
    String deleteServeur(Long id);
}

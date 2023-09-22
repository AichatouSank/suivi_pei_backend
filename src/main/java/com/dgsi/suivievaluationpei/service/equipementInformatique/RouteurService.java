package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Routeur;

import java.util.List;

public interface RouteurService {
    Routeur addRouteur(Routeur routeur);
    List<EquipementInformatique> getAllRouteur();
    Routeur updateRouteur(Routeur routeur);
    String deleteRouteur(Long id);
}

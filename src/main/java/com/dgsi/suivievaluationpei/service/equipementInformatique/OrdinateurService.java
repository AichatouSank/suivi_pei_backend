package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Ordinateur;

import java.util.List;

public interface OrdinateurService {
    Ordinateur addOrdinateur(Ordinateur ordinateur);
    List<EquipementInformatique> getAllOrdinateur();
    Ordinateur updateOrdinateur(Ordinateur ordinateur);
    String deleteOrdinateur(Long id);
}

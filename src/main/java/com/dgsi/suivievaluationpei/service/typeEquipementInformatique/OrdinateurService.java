package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Ordinateur;

import java.util.List;

public interface OrdinateurService {
    Ordinateur addOrdinateur(Ordinateur ordinateur);
    List<Ordinateur> getAllOrdinateur();
    Ordinateur updateOrdinateur(Long id,Ordinateur ordinateur);
    boolean deleteOrdinateur(Long id);
}

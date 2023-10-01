package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Routeur;

import java.util.List;

public interface RouteurService {
    Routeur addRouteur(Routeur routeur);
    List<Routeur> getAllRouteur();
    Routeur updateRouteur(Long id, Routeur routeur);
    boolean deleteRouteur(Long id);
}

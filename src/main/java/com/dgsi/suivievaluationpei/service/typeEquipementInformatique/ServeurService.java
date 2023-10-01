package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Serveur;

import java.util.List;

public interface ServeurService {
    Serveur addServeur(Serveur serveur);
    List<Serveur> getAllServeur();
    Serveur updateServeur(Long id, Serveur serveur);
    boolean deleteServeur(Long id);
}

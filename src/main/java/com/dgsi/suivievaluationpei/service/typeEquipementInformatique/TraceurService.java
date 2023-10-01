package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Traceur;

import java.util.List;

public interface TraceurService {
    Traceur addTraceur(Traceur cleUSB);
    List<Traceur> getAllTraceur();
    Traceur updateTraceur(Long id, Traceur traceur);

    boolean deleteTraceur(Long id);
}

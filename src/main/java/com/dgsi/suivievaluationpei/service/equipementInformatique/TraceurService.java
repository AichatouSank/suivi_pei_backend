package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Traceur;

import java.util.List;

public interface TraceurService {
    Traceur addTraceur(Traceur cleUSB);
    List<Traceur> getAllTraceur();
    Traceur updateTraceur(Traceur cleUSB);
    boolean deleteTraceur(Long id);
}

package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Onduleur;

import java.util.List;

public interface OnduleurService {
    Onduleur addOnduleur(Onduleur onduleur);
    List<EquipementInformatique> getAllOnduleur();
    Onduleur updateOnduleur(Onduleur onduleur);
    String deleteOnduleur(Long id);
}

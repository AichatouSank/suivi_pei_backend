package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Onduleur;

import java.util.List;

public interface OnduleurService {
    Onduleur addOnduleur(Onduleur onduleur);
    List<Onduleur> getAllOnduleur();
    Onduleur updateOnduleur(Onduleur onduleur);
    boolean deleteOnduleur(Long id);
}

package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Onduleur;

import java.util.List;

public interface OnduleurService {
    Onduleur addOnduleur(Onduleur onduleur);
    List<Onduleur> getAllOnduleur();
    Onduleur updateOnduleur(Long id, Onduleur onduleur);
    boolean deleteOnduleur(Long id);
}

package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.PareFeu;

import java.util.List;

public interface PareFeuService {
    PareFeu addPareFeu(PareFeu pareFeu);
    List<PareFeu> getAllPareFeu();
    PareFeu updatePareFeu(Long id, PareFeu pareFeu);
    boolean deletePareFeu(Long id);
}

package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.PareFeu;

import java.util.List;

public interface PareFeuService {
    PareFeu addPareFeu(PareFeu pareFeu);
    List<PareFeu> getAllPareFeu();
    PareFeu updatePareFeu(PareFeu pareFeu);
    boolean deletePareFeu(Long id);
}

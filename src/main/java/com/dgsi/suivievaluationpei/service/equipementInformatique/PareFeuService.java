package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.PareFeu;

import java.util.List;

public interface PareFeuService {
    PareFeu addPareFeu(PareFeu pareFeu);
    List<EquipementInformatique> getAllPareFeu();
    PareFeu updatePareFeu(PareFeu pareFeu);
    String deletePareFeu(Long id);
}

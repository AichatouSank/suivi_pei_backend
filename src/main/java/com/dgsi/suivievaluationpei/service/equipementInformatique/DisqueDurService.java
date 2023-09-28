package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.DisqueDur;

import java.util.List;

public interface DisqueDurService {
    DisqueDur addDisqueDur(DisqueDur disqueDur);
    List<DisqueDur> getAllDisqueDur();
    DisqueDur updateDisqueDur(DisqueDur disqueDur);
    boolean deleteDisqueDur(Long id);
}

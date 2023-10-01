package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.DisqueDur;

import java.util.List;

public interface DisqueDurService {
    DisqueDur addDisqueDur(DisqueDur disqueDur);
    List<DisqueDur> getAllDisqueDur();
    DisqueDur updateDisqueDur(Long id, DisqueDur disqueDur);
    boolean deleteDisqueDur(Long id);
}

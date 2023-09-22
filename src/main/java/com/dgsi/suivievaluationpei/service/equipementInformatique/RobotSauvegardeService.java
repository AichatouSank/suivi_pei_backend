package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.RobotSauvegarde;

import java.util.List;

public interface RobotSauvegardeService {
    RobotSauvegarde addRobotSauvegarde(RobotSauvegarde robotSauvegarde);
    List<EquipementInformatique> getAllRobotSauvegarde();
    RobotSauvegarde updateRobotSauvegarde(RobotSauvegarde robotSauvegarde);
    String deleteRobotSauvegarde(Long id);
}

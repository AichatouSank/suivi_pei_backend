package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.RobotSauvegarde;

import java.util.List;

public interface RobotSauvegardeService {
    RobotSauvegarde addRobotSauvegarde(RobotSauvegarde robotSauvegarde);
    List<RobotSauvegarde> getAllRobotSauvegarde();
    RobotSauvegarde updateRobotSauvegarde(Long id, RobotSauvegarde robotSauvegarde);
    boolean deleteRobotSauvegarde(Long id);
}

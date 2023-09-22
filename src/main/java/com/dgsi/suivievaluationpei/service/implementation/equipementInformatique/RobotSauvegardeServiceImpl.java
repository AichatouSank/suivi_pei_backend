package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.RobotSauvegarde;
import com.dgsi.suivievaluationpei.service.equipementInformatique.RobotSauvegardeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class RobotSauvegardeServiceImpl implements RobotSauvegardeService {
    @Override
    public RobotSauvegarde addRobotSauvegarde(RobotSauvegarde robotSauvegarde) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllRobotSauvegarde() {
        return null;
    }

    @Override
    public RobotSauvegarde updateRobotSauvegarde(RobotSauvegarde robotSauvegarde) {
        return null;
    }

    @Override
    public String deleteRobotSauvegarde(Long id) {
        return null;
    }
}

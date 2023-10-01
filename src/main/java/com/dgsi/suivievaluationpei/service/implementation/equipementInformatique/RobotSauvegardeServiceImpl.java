package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.RobotSauvegarde;
import com.dgsi.suivievaluationpei.repository.typeEquipement.RobotSauvegardeRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.RobotSauvegardeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class RobotSauvegardeServiceImpl implements RobotSauvegardeService {
    private final RobotSauvegardeRepository robotSauvegardeRepository;
    @Override
    public RobotSauvegarde addRobotSauvegarde(RobotSauvegarde robotSauvegarde) {
        return robotSauvegardeRepository.save(robotSauvegarde);
    }

    @Override
    public List<RobotSauvegarde> getAllRobotSauvegarde() {
        return robotSauvegardeRepository.findAll();
    }

    @Override
    public RobotSauvegarde updateRobotSauvegarde(Long id, RobotSauvegarde robotSauvegarde) {
        robotSauvegardeRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        robotSauvegarde.setEquipementId(id);
        return robotSauvegardeRepository.save(robotSauvegarde);
    }

    @Override
    public boolean deleteRobotSauvegarde(Long id) {
       RobotSauvegarde robotSauvegarde =  robotSauvegardeRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        robotSauvegardeRepository.delete(robotSauvegarde);
        return true;
    }
}

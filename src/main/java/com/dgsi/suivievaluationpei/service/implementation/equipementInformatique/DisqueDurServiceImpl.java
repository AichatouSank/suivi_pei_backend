package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.DisqueDur;
import com.dgsi.suivievaluationpei.repository.typeEquipement.DisqueDurRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.DisqueDurService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class DisqueDurServiceImpl implements DisqueDurService {
    private final DisqueDurRepository disqueDurRepository;
    @Override
    public DisqueDur addDisqueDur(DisqueDur disqueDur) {
        return disqueDurRepository.save(disqueDur);
    }

    @Override
    public List<DisqueDur> getAllDisqueDur() {
        return disqueDurRepository.findAll();
    }

    @Override
    public DisqueDur updateDisqueDur(Long id, DisqueDur disqueDur) {
        disqueDurRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        disqueDur.setEquipementId(id);
        return disqueDurRepository.save(disqueDur);
    }

    @Override
    public boolean deleteDisqueDur(Long id) {
        DisqueDur disqueDur = disqueDurRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
            disqueDurRepository.delete(disqueDur);
        return true;
    }
}

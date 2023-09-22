package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.DisqueDur;
import com.dgsi.suivievaluationpei.service.equipementInformatique.DisqueDurService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class DisqueDurServiceImpl implements DisqueDurService {
    @Override
    public DisqueDur addDisqueDur(DisqueDur disqueDur) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllDisqueDur() {
        return null;
    }

    @Override
    public DisqueDur updateDisqueDur(DisqueDur disqueDur) {
        return null;
    }

    @Override
    public String deleteDisqueDur(Long id) {
        return null;
    }
}

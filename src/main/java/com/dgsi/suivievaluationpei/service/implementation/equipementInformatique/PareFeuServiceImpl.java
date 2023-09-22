package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.PareFeu;
import com.dgsi.suivievaluationpei.service.equipementInformatique.PareFeuService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class PareFeuServiceImpl implements PareFeuService {
    @Override
    public PareFeu addPareFeu(PareFeu pareFeu) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllPareFeu() {
        return null;
    }

    @Override
    public PareFeu updatePareFeu(PareFeu pareFeu) {
        return null;
    }

    @Override
    public String deletePareFeu(Long id) {
        return null;
    }
}

package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.Imprimante;
import com.dgsi.suivievaluationpei.service.equipementInformatique.ImprimanteService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class ImprimanteServiceImpl implements ImprimanteService {
    @Override
    public Imprimante addImprimante(Imprimante imprimante) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllImprimante() {
        return null;
    }

    @Override
    public Imprimante updateImprimante(Imprimante imprimante) {
        return null;
    }

    @Override
    public String deleteImprimante(Long id) {
        return null;
    }
}

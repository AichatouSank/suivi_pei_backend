package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Imprimante;

import java.util.List;

public interface ImprimanteService {
    Imprimante addImprimante(Imprimante imprimante);
    List<Imprimante> getAllImprimante();
    Imprimante updateImprimante(Imprimante imprimante);
    boolean deleteImprimante(Long id);
}

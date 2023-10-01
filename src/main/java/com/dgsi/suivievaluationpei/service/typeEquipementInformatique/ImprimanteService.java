package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Imprimante;

import java.util.List;

public interface ImprimanteService {
    Imprimante addImprimante(Imprimante imprimante);
    List<Imprimante> getAllImprimante();
    Imprimante updateImprimante(Long id, Imprimante imprimante);
    boolean deleteImprimante(Long id);
}

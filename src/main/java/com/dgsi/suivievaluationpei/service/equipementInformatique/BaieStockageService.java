package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.BaieStockage;

import java.util.List;

public interface BaieStockageService {
    BaieStockage addBaie(BaieStockage baieStockage);
    List<EquipementInformatique> getAllBaieStockage();
    BaieStockage updateBaieStockage(BaieStockage baieStockage);
    String deleteBaieStockage(Long id);
}

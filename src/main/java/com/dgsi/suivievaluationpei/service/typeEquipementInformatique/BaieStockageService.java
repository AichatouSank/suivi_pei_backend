package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.BaieStockage;

import java.util.List;

public interface BaieStockageService {
    BaieStockage addBaie(BaieStockage baieStockage);
    List<BaieStockage> getAllBaieStockage();
    BaieStockage updateBaieStockage(Long id, BaieStockage baieStockage);
    boolean deleteBaieStockage(Long id);
}

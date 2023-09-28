package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.BaieStockage;

import java.util.List;

public interface BaieStockageService {
    BaieStockage addBaie(BaieStockage baieStockage);
    List<BaieStockage> getAllBaieStockage();
    BaieStockage updateBaieStockage(BaieStockage baieStockage);
    boolean deleteBaieStockage(Long id);
}

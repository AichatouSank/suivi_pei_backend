package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.BaieStockage;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;

import java.util.List;

public interface CleUSBService{
    CleUSB addCleUSB(CleUSB cleUSB);
    List<EquipementInformatique> getAllCleUSB();
    CleUSB updateCleUSB(CleUSB cleUSB);
    String deleteCleUSB(Long id);
}

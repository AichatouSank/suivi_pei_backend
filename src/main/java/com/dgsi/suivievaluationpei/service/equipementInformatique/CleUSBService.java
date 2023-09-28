package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.BaieStockage;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;

import java.util.List;

public interface CleUSBService{
    CleUSB addCleUSB(CleUSB cleUSB);
    List<CleUSB> getAllCleUSB();
    CleUSB updateCleUSB(CleUSB cleUSB);
    boolean deleteCleUSB(Long id);
}

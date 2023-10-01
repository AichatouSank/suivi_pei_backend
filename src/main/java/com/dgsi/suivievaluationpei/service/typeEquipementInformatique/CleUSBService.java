package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;

import java.util.List;

public interface CleUSBService{
    CleUSB addCleUSB(CleUSB cleUSB);
    List<CleUSB> getAllCleUSB();
    CleUSB updateCleUSB(Long id, CleUSB cleUSB);
    boolean deleteCleUSB(Long id);
}

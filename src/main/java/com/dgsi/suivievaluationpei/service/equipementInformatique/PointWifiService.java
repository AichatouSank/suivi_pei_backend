package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.PointWifi;

import java.util.List;

public interface PointWifiService {
    PointWifi addPointWifi(PointWifi pointWifi);
    List<EquipementInformatique> getAllPointWifi();
    PointWifi updatePointWifi(PointWifi pointWifi);
    String deletePointWifi(Long id);
}

package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.PointWifi;

import java.util.List;

public interface PointWifiService {
    PointWifi addPointWifi(PointWifi pointWifi);
    List<PointWifi> getAllPointWifi();

    PointWifi updatePointWifi(Long id, PointWifi pointWifi);

    boolean deletePointWifi(Long id);
}

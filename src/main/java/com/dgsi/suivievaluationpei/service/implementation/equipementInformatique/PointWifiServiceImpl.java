package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.PointWifi;
import com.dgsi.suivievaluationpei.service.equipementInformatique.PointWifiService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class PointWifiServiceImpl implements PointWifiService {
    @Override
    public PointWifi addPointWifi(PointWifi pointWifi) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllPointWifi() {
        return null;
    }

    @Override
    public PointWifi updatePointWifi(PointWifi pointWifi) {
        return null;
    }

    @Override
    public String deletePointWifi(Long id) {
        return null;
    }
}

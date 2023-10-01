package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.PointWifi;
import com.dgsi.suivievaluationpei.repository.typeEquipement.PointWifiRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.PointWifiService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Service
public class PointWifiServiceImpl implements PointWifiService {
    private final PointWifiRepository pointWifiRepository;
    @Override
    public PointWifi addPointWifi(PointWifi pointWifi) {
        return pointWifiRepository.save(pointWifi);
    }

    @Override
    public List<PointWifi> getAllPointWifi() {
        return pointWifiRepository.findAll();
    }

    @Override
    public PointWifi updatePointWifi(Long id, PointWifi pointWifi) {
        pointWifiRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : " + id +" invalide"));
        pointWifi.setEquipementId(id);
        return pointWifiRepository.save(pointWifi);
    }

    @Override
    public boolean deletePointWifi(Long id) {
       PointWifi pointWifi= pointWifiRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "id : " + id +" invalide"));
        pointWifiRepository.delete(pointWifi);
        return true;
    }
}

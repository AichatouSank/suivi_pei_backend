package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.service.equipementInformatique.CleUSBService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class CleUSBServiceImpl implements CleUSBService {
    @Override
    public CleUSB addCleUSB(CleUSB cleUSB) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllCleUSB() {
        return null;
    }

    @Override
    public CleUSB updateCleUSB(CleUSB cleUSB) {
        return null;
    }

    @Override
    public String deleteCleUSB(Long id) {
        return null;
    }
}

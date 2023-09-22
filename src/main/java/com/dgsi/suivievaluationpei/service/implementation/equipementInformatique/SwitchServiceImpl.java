package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.Switch;
import com.dgsi.suivievaluationpei.service.equipementInformatique.SwitchService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class SwitchServiceImpl implements SwitchService {
    @Override
    public Switch addSwitch(Switch cleUSB) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllSwitch() {
        return null;
    }

    @Override
    public Switch updateSwitch(Switch cleUSB) {
        return null;
    }

    @Override
    public String deleteSwitch(Long id) {
        return null;
    }
}

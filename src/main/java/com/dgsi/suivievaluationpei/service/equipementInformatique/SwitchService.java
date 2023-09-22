package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Switch;

import java.util.List;

public interface SwitchService {
    Switch addSwitch(Switch cleUSB);
    List<EquipementInformatique> getAllSwitch();
    Switch updateSwitch(Switch cleUSB);
    String deleteSwitch(Long id);
}

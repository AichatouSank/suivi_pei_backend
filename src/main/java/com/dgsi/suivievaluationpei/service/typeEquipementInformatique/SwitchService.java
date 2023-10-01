package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Switch;

import java.util.List;

public interface SwitchService {
    Switch addSwitch(Switch eqsitch);
    List<Switch> getAllSwitch();
    Switch updateSwitch(Long id, Switch eqsitch);

    boolean deleteSwitch(Long id);
}

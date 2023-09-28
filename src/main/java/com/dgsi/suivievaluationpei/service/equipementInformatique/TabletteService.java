package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Tablette;

import java.util.List;

public interface TabletteService {
    Tablette addTablette(Tablette tablette);
    List<Tablette> getAllTablette();
    Tablette updateTablette(Tablette tablette);
    boolean deleteTablette(Long id);
}

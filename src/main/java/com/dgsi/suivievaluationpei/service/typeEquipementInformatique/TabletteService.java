package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Tablette;

import java.util.List;

public interface TabletteService {
    Tablette addTablette(Tablette tablette);
    List<Tablette> getAllTablette();

    Tablette updateTablette(Long id, Tablette tablette);

    boolean deleteTablette(Long id);
}

package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Photocopieuse;

import java.util.List;

public interface PhotocopieuseService {
    Photocopieuse addPhotocopieuse(Photocopieuse photocopieuse);
    List<EquipementInformatique> getAllPhotocopieuse();
    Photocopieuse updatePhotocopieuse(Photocopieuse photocopieuse);
    String deletePhotocopieuse(Long id);
}

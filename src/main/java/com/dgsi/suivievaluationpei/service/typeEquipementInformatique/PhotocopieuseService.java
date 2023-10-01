package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Photocopieuse;

import java.util.List;

public interface PhotocopieuseService {
    Photocopieuse addPhotocopieuse(Photocopieuse photocopieuse);
    List<Photocopieuse> getAllPhotocopieuse();
    Photocopieuse updatePhotocopieuse(Long id, Photocopieuse photocopieuse);
    boolean deletePhotocopieuse(Long id);
}

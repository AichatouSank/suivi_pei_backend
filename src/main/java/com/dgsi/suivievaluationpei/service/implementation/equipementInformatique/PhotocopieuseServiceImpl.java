package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.Photocopieuse;
import com.dgsi.suivievaluationpei.service.equipementInformatique.PhotocopieuseService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class PhotocopieuseServiceImpl implements PhotocopieuseService {
    @Override
    public Photocopieuse addPhotocopieuse(Photocopieuse photocopieuse) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllPhotocopieuse() {
        return null;
    }

    @Override
    public Photocopieuse updatePhotocopieuse(Photocopieuse photocopieuse) {
        return null;
    }

    @Override
    public String deletePhotocopieuse(Long id) {
        return null;
    }
}

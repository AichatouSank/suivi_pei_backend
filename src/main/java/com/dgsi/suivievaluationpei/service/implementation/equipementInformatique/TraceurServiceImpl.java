package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.Traceur;
import com.dgsi.suivievaluationpei.service.equipementInformatique.TraceurService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class TraceurServiceImpl implements TraceurService {
    @Override
    public Traceur addTraceur(Traceur cleUSB) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllTraceur() {
        return null;
    }

    @Override
    public Traceur updateTraceur(Traceur cleUSB) {
        return null;
    }

    @Override
    public String deleteTraceur(Long id) {
        return null;
    }
}

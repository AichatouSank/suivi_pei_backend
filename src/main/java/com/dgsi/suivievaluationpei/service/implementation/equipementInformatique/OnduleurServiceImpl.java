package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.Onduleur;
import com.dgsi.suivievaluationpei.service.equipementInformatique.OnduleurService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class OnduleurServiceImpl implements OnduleurService {
    @Override
    public Onduleur addOnduleur(Onduleur onduleur) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllOnduleur() {
        return null;
    }

    @Override
    public Onduleur updateOnduleur(Onduleur onduleur) {
        return null;
    }

    @Override
    public String deleteOnduleur(Long id) {
        return null;
    }
}

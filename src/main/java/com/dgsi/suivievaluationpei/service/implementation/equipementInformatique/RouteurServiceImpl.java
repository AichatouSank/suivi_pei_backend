package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.Routeur;
import com.dgsi.suivievaluationpei.service.equipementInformatique.RouteurService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class RouteurServiceImpl implements RouteurService {
    @Override
    public Routeur addRouteur(Routeur routeur) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllRouteur() {
        return null;
    }

    @Override
    public Routeur updateRouteur(Routeur routeur) {
        return null;
    }

    @Override
    public String deleteRouteur(Long id) {
        return null;
    }
}

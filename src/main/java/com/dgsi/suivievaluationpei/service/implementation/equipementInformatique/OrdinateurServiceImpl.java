package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.Ordinateur;
import com.dgsi.suivievaluationpei.service.equipementInformatique.OrdinateurService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class OrdinateurServiceImpl implements OrdinateurService {
    @Override
    public Ordinateur addOrdinateur(Ordinateur ordinateur) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllOrdinateur() {
        return null;
    }

    @Override
    public Ordinateur updateOrdinateur(Ordinateur ordinateur) {
        return null;
    }

    @Override
    public String deleteOrdinateur(Long id) {
        return null;
    }
}

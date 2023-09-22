package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.Tablette;
import com.dgsi.suivievaluationpei.service.equipementInformatique.TabletteService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class TabletteServiceImpl implements TabletteService {
    @Override
    public Tablette addTablette(Tablette tablette) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllTablette() {
        return null;
    }

    @Override
    public Tablette updateTablette(Tablette tablette) {
        return null;
    }

    @Override
    public String deleteTablette(Long id) {
        return null;
    }
}

package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Tablette;
import com.dgsi.suivievaluationpei.repository.typeEquipement.TabletteRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.TabletteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Service
public class TabletteServiceImpl implements TabletteService {
    private final TabletteRepository tabletteRepository;
    @Override
    public Tablette addTablette(Tablette tablette) {
        return tabletteRepository.save(tablette);
    }

    @Override
    public List<Tablette> getAllTablette() {
        return tabletteRepository.findAll();
    }

    @Override
    public Tablette updateTablette(Long id, Tablette tablette) {
        tabletteRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        tablette.setEquipementId(id);
        return tabletteRepository.save(tablette);
    }

    @Override
    public boolean deleteTablette(Long id) {
        Tablette tablette = tabletteRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
    tabletteRepository.delete(tablette);
        return true;
    }
}

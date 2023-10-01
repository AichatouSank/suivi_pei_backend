package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.PareFeu;
import com.dgsi.suivievaluationpei.repository.typeEquipement.PareFeuRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.PareFeuService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class PareFeuServiceImpl implements PareFeuService {
    private final PareFeuRepository pareFeuRepository;
    @Override
    public PareFeu addPareFeu(PareFeu pareFeu) {
        return pareFeuRepository.save(pareFeu);
    }

    @Override
    public List<PareFeu> getAllPareFeu() {
        return pareFeuRepository.findAll();
    }

    @Override
    public PareFeu updatePareFeu(Long id, PareFeu pareFeu) {
        pareFeuRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        pareFeu.setEquipementId(id);
        return pareFeuRepository.save(pareFeu);
    }

    @Override
    public boolean deletePareFeu(Long id) {
        PareFeu pareFeu = pareFeuRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        pareFeuRepository.delete(pareFeu);
        return true;
    }
}

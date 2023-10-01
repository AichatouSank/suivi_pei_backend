package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Imprimante;
import com.dgsi.suivievaluationpei.repository.typeEquipement.ImprimanteRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.ImprimanteService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class ImprimanteServiceImpl implements ImprimanteService {
    private  final ImprimanteRepository imprimanteRepository;
    @Override
    public Imprimante addImprimante(Imprimante imprimante) {
        return imprimanteRepository.save(imprimante);
    }

    @Override
    public List<Imprimante> getAllImprimante() {
        return imprimanteRepository.findAll();
    }

    @Override
    public Imprimante updateImprimante(Long id, Imprimante imprimante) {
        imprimanteRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        imprimante.setEquipementId(id);
        return imprimanteRepository.save(imprimante);
    }

    @Override
    public boolean deleteImprimante(Long id) {
        Imprimante imprimante = imprimanteRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        imprimanteRepository.delete(imprimante);
        return true;
    }
}

package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.BaieStockage;
import com.dgsi.suivievaluationpei.repository.typeEquipement.BaieStockageRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.BaieStockageService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Service
public class BaieStockageServiceImpl implements BaieStockageService {
    private BaieStockageRepository baieStockageRepository;
    @Override
    public BaieStockage addBaie(BaieStockage baieStockage) {
        return baieStockageRepository.save(baieStockage);
    }

    @Override
    public List<BaieStockage> getAllBaieStockage() {
        return baieStockageRepository.findAll();
    }

    @Override
    public BaieStockage updateBaieStockage(Long id, BaieStockage baieStockage) {
        baieStockageRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        baieStockage.setEquipementId(id);
        return baieStockageRepository.save(baieStockage);
    }

    @Override
    public boolean deleteBaieStockage(Long id) {
        BaieStockage baieStockage = baieStockageRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
            baieStockageRepository.delete(baieStockage);
        return true;
    }
}

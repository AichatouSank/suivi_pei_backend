package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.BaieStockage;
import com.dgsi.suivievaluationpei.repository.typeEquipement.BaieStockageRepository;
import com.dgsi.suivievaluationpei.service.equipementInformatique.BaieStockageService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class BaieStockageServiceImpl implements BaieStockageService {
    private BaieStockageRepository baieStockageRepository;
    @Override
    public BaieStockage addBaie(BaieStockage baieStockage) {
        return baieStockageRepository.save(baieStockage);
    }

    @Override
    public List<EquipementInformatique> getAllBaieStockage() {
        return baieStockageRepository.findAll();
    }

    @Override
    public BaieStockage updateBaieStockage(BaieStockage baieStockage) {
        return baieStockageRepository.save(baieStockage);
    }

    @Override
    public String deleteBaieStockage(Long id) {
        return null;
    }
}

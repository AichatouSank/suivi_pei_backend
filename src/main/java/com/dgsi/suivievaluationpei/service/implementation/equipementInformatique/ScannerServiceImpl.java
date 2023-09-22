package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.Scanner;
import com.dgsi.suivievaluationpei.service.equipementInformatique.ScannerService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class ScannerServiceImpl implements ScannerService {
    @Override
    public Scanner addScanner(Scanner scanner) {
        return null;
    }

    @Override
    public List<EquipementInformatique> getAllScanner() {
        return null;
    }

    @Override
    public Scanner updateScanner(Scanner scanner) {
        return null;
    }

    @Override
    public String deleteScanner(Long id) {
        return null;
    }
}

package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Scanner;
import com.dgsi.suivievaluationpei.repository.typeEquipement.ScannerRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.ScannerService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class ScannerServiceImpl implements ScannerService {
    private final ScannerRepository scannerRepository;
    @Override
    public Scanner addScanner(Scanner scanner) {
        return scannerRepository.save(scanner);
    }

    @Override
    public List<Scanner> getAllScanner() {
        return scannerRepository.findAll();
    }

    @Override
    public Scanner updateScanner(Long id, Scanner scanner) {
        scannerRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
    scanner.setEquipementId(id);
        return scannerRepository.save(scanner);
    }

    @Override
    public boolean deleteScanner(Long id) {
        Scanner scanner = scannerRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        scannerRepository.delete(scanner);
        return true;
    }
}

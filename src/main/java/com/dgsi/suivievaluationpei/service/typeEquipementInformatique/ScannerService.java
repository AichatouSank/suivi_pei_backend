package com.dgsi.suivievaluationpei.service.typeEquipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Scanner;

import java.util.List;

public interface ScannerService {
    Scanner addScanner(Scanner scanner);
    List<Scanner> getAllScanner();
    Scanner updateScanner(Long id, Scanner scanner);
    boolean deleteScanner(Long id);
}

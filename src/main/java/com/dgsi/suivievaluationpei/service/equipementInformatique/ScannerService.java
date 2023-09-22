package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Scanner;

import java.util.List;

public interface ScannerService {
    Scanner addScanner(Scanner scanner);
    List<EquipementInformatique> getAllScanner();
    Scanner updateScanner(Scanner scanner);
    String deleteScanner(Long id);
}

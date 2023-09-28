package com.dgsi.suivievaluationpei.service.equipementInformatique;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.model.typeEquipement.Scanner;

import java.util.List;

public interface ScannerService {
    Scanner addScanner(Scanner scanner);
    List<java.util.Scanner> getAllScanner();
    Scanner updateScanner(Scanner scanner);
    boolean deleteScanner(Long id);
}

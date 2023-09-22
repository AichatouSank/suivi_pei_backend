package com.dgsi.suivievaluationpei.controller.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.BaieStockage;
import com.dgsi.suivievaluationpei.service.implementation.equipementInformatique.BaieStockageServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/baieStockage")
@CrossOrigin
@AllArgsConstructor
public class BaieStockageController {
    private BaieStockageServiceImpl baieStockageService;

}

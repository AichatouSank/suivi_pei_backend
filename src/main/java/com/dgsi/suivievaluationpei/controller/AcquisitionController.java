package com.dgsi.suivievaluationpei.controller;

import com.dgsi.suivievaluationpei.model.Acquisition;
import com.dgsi.suivievaluationpei.service.implementation.AcquisitionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/api/v1/acquisitions")
public class AcquisitionController {
    private AcquisitionServiceImpl acquisitionService;
    @PostMapping
    public ResponseEntity<Acquisition> addAcquisition(@RequestBody Acquisition acquisition) {
        acquisitionService.addAcquisition(acquisition);
        return  ResponseEntity.ok(acquisition);
    }
    @GetMapping
    public ResponseEntity<Acquisition> getAllAcquisition(){
        acquisitionService.getAllAcquisition();
        return (ResponseEntity<Acquisition>) ResponseEntity.ok();
    }

}

package com.dgsi.suivievaluationpei.controller;

import com.dgsi.suivievaluationpei.enumeration.ModeAcquisition;
import com.dgsi.suivievaluationpei.model.Acquisition;
import com.dgsi.suivievaluationpei.response.CustomResponse;
import com.dgsi.suivievaluationpei.service.AcquisitionService;
import com.dgsi.suivievaluationpei.service.implementation.AcquisitionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

import static org.springframework.http.HttpStatus.OK;


@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/api/v1/acquisitions")
public class AcquisitionController {
    private AcquisitionService acquisitionService;
    @PostMapping
    public ResponseEntity<CustomResponse> addAcquisition(@RequestBody Acquisition acquisition) {
       return ResponseEntity.ok(
               CustomResponse.builder().build()
       );
    }
    @GetMapping
    public ResponseEntity<CustomResponse> getAllAcquisition(){
        return  ResponseEntity.ok(
                CustomResponse.builder().build()
        );
    }
    @GetMapping("/mode")
    public ResponseEntity<CustomResponse>findByModeAcquisition(ModeAcquisition mode){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Acquisitions", acquisitionService.findByModeAcquiqition(mode)))
                        .message("Liste des acquisitions par mode d'acquisition :")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @GetMapping("/date")
    public ResponseEntity<CustomResponse>findByDateAcquisition(LocalDate date){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Acquisitions", acquisitionService.findByDateAacquisiyion(date)))
                        .message("Liste des acquisitions par mode d'acquisition :")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

}

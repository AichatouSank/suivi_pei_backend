package com.dgsi.suivievaluationpei.controller;

import com.dgsi.suivievaluationpei.model.Acquisition;
import com.dgsi.suivievaluationpei.model.ModeAcquisition;
import com.dgsi.suivievaluationpei.response.CustomResponse;
import com.dgsi.suivievaluationpei.service.AcquisitionService;
import com.dgsi.suivievaluationpei.service.implementation.AcquisitionServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

import static org.springframework.http.HttpStatus.*;


@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/api/v1/acquisitions")
public class AcquisitionController {
    private final AcquisitionService acquisitionService;
    @PostMapping
    public ResponseEntity<CustomResponse> addAcquisition(@RequestBody @Valid Acquisition acquisition) {
       return ResponseEntity.ok(
               CustomResponse.builder()
                       .timeStamp(LocalDateTime.now())
                       .data(Map.of("Acquisition", acquisitionService.addAcquisition(acquisition)))
                       .message("Ajout de l'acquisition à la date: " + acquisition.getDateAcquisition())
                       .status(CREATED)
                       .statusCode(CREATED.value())
                       .build()
       );
    }
    @GetMapping
    public ResponseEntity<CustomResponse> getAllAcquisition(){
        return  ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Acquisitions", acquisitionService.getAllAcquisition()))
                        .message("Liste de toutes les acquisitions")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @GetMapping("/{field}")
    public ResponseEntity<CustomResponse> getAllAcquisitionBySort(@PathVariable String field){
        return  ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Acquisitions", acquisitionService.getAllBySortAcquisition(field)))
                        .message("Liste de toutes les acquisitions")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @GetMapping("/mode")
    public ResponseEntity<CustomResponse>findByModeAcquisition(ModeAcquisition mode){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Acquisitions", acquisitionService.findByModeAcquiqition(mode)))
                        .message("Liste des acquisitions par mode d'acquisition :" + mode)
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @GetMapping("/date")
    public ResponseEntity<CustomResponse>findByDateAcquisition(LocalDateTime date){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Acquisitions", acquisitionService.findByDateAcquisition(date)))
                        .message("Liste des acquisitions par mode d'acquisition :"+date)
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @GetMapping("/date-mode")
    public ResponseEntity<CustomResponse>findByDateAndModeAcquisition(LocalDateTime date,
                                                                      ModeAcquisition modeAcquisition){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Acquisitions", acquisitionService.findByDateAndMode(date, modeAcquisition)))
                        .message("Liste des acquisitions par mode d'acquisition :"+modeAcquisition+ "à la date: "+date)
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @PutMapping()
    public ResponseEntity<CustomResponse>UpdateAcquisition(Long id, Acquisition acquisition){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Acquisition", acquisitionService.updateAcquisition(id,acquisition)))
                        .message("Mise à jour de l'acquisiton à la date: " + acquisition.getDateAcquisition())
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @DeleteMapping()
    public ResponseEntity<CustomResponse>deleAcquisition(Long id){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Acquisition", acquisitionService.deleteAcquisitionById(id)))
                        .message("Suppression d'une acquisition")
                        .status(NO_CONTENT)
                        .statusCode(NO_CONTENT.value())
                        .build()
        );
    }

}

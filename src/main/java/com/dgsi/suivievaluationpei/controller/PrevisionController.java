package com.dgsi.suivievaluationpei.controller;

import com.dgsi.suivievaluationpei.model.Prevision;
import com.dgsi.suivievaluationpei.repository.PrevisionRepository;
import com.dgsi.suivievaluationpei.response.CustomResponse;
import com.dgsi.suivievaluationpei.service.PrevisionService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/previsions")
public class PrevisionController {
    private final PrevisionService previsionService;
    @PostMapping
    public ResponseEntity<CustomResponse> addPrevision(@RequestBody @Valid Prevision prevision){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Previsions", previsionService.addPrevision(prevision)))
                        .message("Ajout d'une nouvelle prevision")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );
    }
    @GetMapping
    public ResponseEntity<CustomResponse> getAllPrevisions(){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Previsions", previsionService.getAllPrevision()))
                        .message("Liste de toutes les previsions")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @GetMapping("/annee/{annee}")
    public ResponseEntity<CustomResponse> getPrevisionByAnnee(@PathVariable int annee){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Previsions", previsionService.findByAnneeBudgetaire(annee)))
                        .message("Liste des prévisions de l'année : " +annee)
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @GetMapping("/structure/{structure}")
    public ResponseEntity<CustomResponse> getPrevisionByStructure(String structure){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Previsions", previsionService.findByStructure(structure)))
                        .message("Liste des prévisions de la structure : "+structure)
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @PutMapping
    public ResponseEntity<CustomResponse> updatePrevision( Prevision prevision){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Previsions", previsionService.updatePrevision(prevision)))
                        .message("Modification d'une prevision")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @DeleteMapping("{id}")
    public ResponseEntity<CustomResponse> deletePrevision(@PathVariable Long id){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Previsions", previsionService.deletePrevision(id)))
                        .message("Modification d'une prevision")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

}

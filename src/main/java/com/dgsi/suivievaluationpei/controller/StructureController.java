package com.dgsi.suivievaluationpei.controller;

import com.dgsi.suivievaluationpei.model.Structure;
import com.dgsi.suivievaluationpei.response.CustomResponse;
import com.dgsi.suivievaluationpei.service.StructureService;
import com.dgsi.suivievaluationpei.service.implementation.StructureServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/structures")
public class StructureController {
    private final StructureService structureService;

    @PostMapping
    public ResponseEntity<CustomResponse> addStructure(@RequestBody @Valid Structure structure){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Structure", structureService.addStructure(structure)))
                        .message("Ajout de la structure : " + structure.getNomStructure())
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );
    }
    @GetMapping
    public ResponseEntity<CustomResponse> getAllStructures(Sort sort){
      return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("structures: ",  structureService.findAllStructures(sort)))
                        .message("Liste de toutes les structures")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @PutMapping
    public ResponseEntity<CustomResponse> updateStructure(Structure structure){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Structure", structureService.updateStructure(structure)))
                        .message("Mise à jour de la structure : " + structure.getNomStructure())
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @DeleteMapping
    public ResponseEntity<CustomResponse> deleteStructure(int id){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Structure", structureService.deleteStructure(id)))
                        .message("Structure supprimée avec succès ")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }


}

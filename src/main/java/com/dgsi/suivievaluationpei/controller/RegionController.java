package com.dgsi.suivievaluationpei.controller;

import com.dgsi.suivievaluationpei.model.Region;
import com.dgsi.suivievaluationpei.response.CustomResponse;
import com.dgsi.suivievaluationpei.service.RegionService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/regions")
@CrossOrigin
public class RegionController {
    private final RegionService regionService;
    @PostMapping
    public ResponseEntity<CustomResponse> AddRegion(@RequestBody @Valid Region region){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("regions", regionService.addRegion(region)))
                        .message("enregistrement de la region : "+ region.getNomRegion())
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @GetMapping
    public ResponseEntity<CustomResponse> getAllRegions(){
        PageRequest pageRequest = PageRequest.of(1,2);
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("liste des régions", regionService.findAllRegions(pageRequest)))
                        .message("liste de toutes les régions")
                        .statusCode(OK.value())
                        .status(OK)
                        .build()
        );
    }
    @PutMapping
    public ResponseEntity<CustomResponse> updateRegion(Region region){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("region", regionService.updateRegion(region)))
                        .message("mise à jour de la région" + region.getNomRegion())
                        .statusCode(OK.value())
                        .status(OK)
                        .build()
        );
    }

}

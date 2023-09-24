package com.dgsi.suivievaluationpei.controller;

import com.dgsi.suivievaluationpei.model.Utilisateur;
import com.dgsi.suivievaluationpei.response.CustomResponse;
import com.dgsi.suivievaluationpei.service.UtilisateurService;
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
@RequestMapping("/api/v/utilisateurs")
public class UtilisateurController {
    private UtilisateurService utilisateurService;

    @PostMapping
    public ResponseEntity<CustomResponse> addUtilisateur(@RequestBody @Valid Utilisateur utilisateur){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Utilisateur", utilisateurService.addUtilisateur(utilisateur)))
                        .message("Ajout de l'utilisateur :" +utilisateur.getNomUtilisateur())
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );
    }

    @GetMapping
    public ResponseEntity<CustomResponse> getAllUsers(){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Utilisateurs", utilisateurService.findALLUtilisateur()))
                        .build()
        );
    }
}

package com.dgsi.suivievaluationpei.controller;

import com.dgsi.suivievaluationpei.model.Role;
import com.dgsi.suivievaluationpei.response.CustomResponse;
import com.dgsi.suivievaluationpei.service.RoleService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("api/v1/roles")
@CrossOrigin
@AllArgsConstructor
public class RoleController {
    private final RoleService roleService;
    @PostMapping
    public ResponseEntity<CustomResponse> addRole(@RequestBody @Valid Role role){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Role", roleService.addRole(role)))
                        .message("Role" + role.getRoleName()+" ajoutée avec succès")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );

    }
    @GetMapping
    public ResponseEntity<CustomResponse> findAllRoles(){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Role", roleService.findAllRoles()))
                        .message("Liste des roles")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );

    }
    @PutMapping
    public ResponseEntity<CustomResponse> updateRole(Role role){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Role", roleService.updateRole(role)))
                        .message("Role" + role.getRoleName()+" modifié avec succès")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );

    }
    @DeleteMapping
    public ResponseEntity<CustomResponse> addRole(int id){
        return ResponseEntity.ok(
                CustomResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Role", roleService.deleteRole(id)))
                        .message("Role supprimé avec succès")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );

    }
}


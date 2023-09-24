package com.dgsi.suivievaluationpei.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
//@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EquipementInformatique {
    @Id
    @SequenceGenerator(
            name = "equipement_generator",
            sequenceName = "equipement_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "equipement_generator"
    )
    private Long equipementId;
    private String marque;
    private String libelle;
    private String modele;
    private Double cout;
    @OneToMany(
            mappedBy = "equipementInformatique"
    )
    private List<StructureEquipement> structureEquipements = new ArrayList<>();
}

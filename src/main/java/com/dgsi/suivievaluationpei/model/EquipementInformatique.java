package com.dgsi.suivievaluationpei.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "equipements")
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
    @Column(nullable = false, length = 50)
    private String marque;
    @Column(nullable = false, length = 50)
    private String libelle;
    private String modele;
    @Column(nullable = false)
    private Double cout;
    /*@OneToMany(
            mappedBy = "equipementInformatique"
    )
    private List<Prevision> previsions = new ArrayList<>();*/
}

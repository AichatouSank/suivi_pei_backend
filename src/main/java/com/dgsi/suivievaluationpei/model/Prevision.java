package com.dgsi.suivievaluationpei.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "previsions")
public class Prevision {
    @Id
    private Long id;
    private int anneeBudgetaire;
    private int quantite;
    private double coutTotal;
    @ManyToOne
    @JoinColumn(name = "structure_id",   insertable = false,
            updatable = false)

    private Structure structure;
    @ManyToOne
    @JoinColumn(name = "equipement_id", referencedColumnName = "equipementId")
    private EquipementInformatique equipementInformatique;
}

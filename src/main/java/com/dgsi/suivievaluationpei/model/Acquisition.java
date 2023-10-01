package com.dgsi.suivievaluationpei.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Aichatou
 * @version 1.0
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "acquisitions")
public class Acquisition {
    @Id
    @SequenceGenerator(
            name = "acquisition_generator",
            sequenceName = "acquisition_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "acquisition_generator"
    )
    private Long acquisitionId;
    private LocalDateTime dateAcquisition;
    private int quantite;
    private double coutReel;
    private double coutTotal;
    //relations
    @ManyToOne
    @JoinColumn(name = "structure_id", referencedColumnName = "structure_id")
    private Structure structure;
    @ManyToOne
    @JoinColumn(name = "equipement_id", referencedColumnName = "equipementId")
    private EquipementInformatique equipementInformatique;
    @ManyToOne
    @JoinColumn(name = "mode_acquisition_id", referencedColumnName = "id")
    private ModeAcquisition modeAcquisition;

}

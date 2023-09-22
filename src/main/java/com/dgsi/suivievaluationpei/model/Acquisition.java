package com.dgsi.suivievaluationpei.model;

import com.dgsi.suivievaluationpei.enumeration.ModeAcquisition;
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
    private ModeAcquisition modeAcquisition;
}

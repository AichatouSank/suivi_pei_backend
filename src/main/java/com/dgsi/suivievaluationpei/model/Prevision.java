package com.dgsi.suivievaluationpei.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "previsions")
public class Prevision {
    @Id
    @SequenceGenerator(
            name = "prevision_generator",
            sequenceName = "prevision_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "prevision_generator"
    )
    private Long PrevisionId;
    private LocalDateTime anneeBudgetaire;
}

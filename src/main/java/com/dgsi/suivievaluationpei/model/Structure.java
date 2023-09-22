package com.dgsi.suivievaluationpei.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "structures",
        uniqueConstraints = @UniqueConstraint(
                name = "UQ_structure_nom",
                columnNames = "nomStructure"
        )
)

public class Structure {
    @Id
    @SequenceGenerator(
            name = "structure_sequence",
            sequenceName = "structure_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "structure_sequence"
    )
    @Column(name = "structure_id")
    private Integer strutureId;
    @NotNull
    @Column(nullable = false, unique = true)
    private String nomStructure;
    private String libelleLong;
    @ManyToMany(
        cascade = CascadeType.ALL
    )
    @JoinColumn(name = "fk_structures_id", referencedColumnName = "structure_id")
    private List<Region> regions;

}

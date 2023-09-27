package com.dgsi.suivievaluationpei.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Aichatou
 * @version 1.0
 */

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
            name = "structure_generator",
            sequenceName = "structure_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "structure_generator"
    )
    @Column(
            name = "structure_id"

    )
    private int strutureId;
    @NotNull
    @Column(nullable = false, unique = true)
    private String nomStructure;
    private String libelleLong;
    //relations
    @ManyToMany(
        cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "structures_regions",
            joinColumns = @JoinColumn(name = "region_id")
            //inverseJoinColumns = @JoinColumn(name = "region_id")

    )
    private List<Region> regions = new ArrayList<>();
  /*  @OneToMany(
            mappedBy = "structure"
    )
    private List<Prevision>previsions = new ArrayList<>();*/

}

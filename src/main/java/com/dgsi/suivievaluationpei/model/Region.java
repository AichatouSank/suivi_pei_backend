package com.dgsi.suivievaluationpei.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "regions")
public class Region {
    @Id
    @SequenceGenerator(
            name = "region_sequence",
            sequenceName =  "region_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "region_sequence"
    )
    @Column(name = "region_id")
    private Integer regionId;
    @Column(unique = true, nullable = false, length = 25)
    private String nomRegion;
  /*  @ManyToMany(
            mappedBy = "regions"
    )
    private List<Structure> structure;*/

}

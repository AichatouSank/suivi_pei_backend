package com.dgsi.suivievaluationpei.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "roles",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "UQ_role_roleName",
                        columnNames = "roleName"
                )
        }
)
public class Role {
    @Id@SequenceGenerator(
            name = "role_generator",
            sequenceName = "role_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence_generator"
    )
    private int roleId;
    @Column(unique = true , length = 25, nullable = false)
    private String roleName;

    @OneToOne(
            mappedBy = "role"
    )
    private Utilisateur utilisateur;
}

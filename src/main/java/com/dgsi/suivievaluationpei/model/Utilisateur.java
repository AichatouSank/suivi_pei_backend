package com.dgsi.suivievaluationpei.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Aichatou
 * @version 1.0
*/
@Entity
@Table(
       name = "utilisateurs",
        uniqueConstraints = @UniqueConstraint(
                name = "UQ_utilisateurs_email",
                columnNames = "email"
        )
)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Utilisateur {
    @Id
    @SequenceGenerator(
            name = "utislisateur_generator",
            sequenceName = "utilisateur_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "utislisateur_generator"
    )
    private Long utilisateurId;
    private String nom;
    private String prenom;
    private String nomUtilisateur;
    private String email;
    private String password;
    @OneToOne
    private Structure structure;
    @OneToOne
    private Role role;
}

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
    @Column(nullable = false, length = 50)
    private String nom;
    @Column(nullable = false, length = 50)
    private String prenom;
    private String nomUtilisateur;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false, length = 25)
    private String password;
    @OneToOne
    @JoinColumn(name = "structure_id", referencedColumnName = "structure_id")
    private Structure structure;
    @ManyToOne
    @JoinColumn(name= "role_id", referencedColumnName = "roleId")
    private Role role;


}

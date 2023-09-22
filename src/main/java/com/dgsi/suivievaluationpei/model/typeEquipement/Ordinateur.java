package com.dgsi.suivievaluationpei.model.typeEquipement;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Ordinateur extends EquipementInformatique {
    private String processeur;
    private String tailleEcran;
    private String RAM;
    private String versionAntivirus;
    private String versionOffice;
}

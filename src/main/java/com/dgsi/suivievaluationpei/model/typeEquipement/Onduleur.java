package com.dgsi.suivievaluationpei.model.typeEquipement;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.Check;

@Entity
@Data
public class Onduleur extends EquipementInformatique {
    //@Check()
    private String capacite;
}

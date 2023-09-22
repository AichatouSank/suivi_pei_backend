package com.dgsi.suivievaluationpei.model.typeEquipement;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
public class CleUSB extends EquipementInformatique {
    private String capacite;
}

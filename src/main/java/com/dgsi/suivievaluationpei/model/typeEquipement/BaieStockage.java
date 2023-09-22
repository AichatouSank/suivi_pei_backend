package com.dgsi.suivievaluationpei.model.typeEquipement;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
public class BaieStockage extends EquipementInformatique {
    private String capacity;
}

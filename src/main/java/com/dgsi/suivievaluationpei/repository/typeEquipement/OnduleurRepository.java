package com.dgsi.suivievaluationpei.repository.typeEquipement;

import com.dgsi.suivievaluationpei.model.typeEquipement.Onduleur;
import com.dgsi.suivievaluationpei.repository.EquipementInformatiqueRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OnduleurRepository extends JpaRepository<Onduleur, Long> {
}

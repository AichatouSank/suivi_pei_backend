package com.dgsi.suivievaluationpei.repository;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface EquipementInformatiqueRepository extends JpaRepository<EquipementInformatique, Long> {
}

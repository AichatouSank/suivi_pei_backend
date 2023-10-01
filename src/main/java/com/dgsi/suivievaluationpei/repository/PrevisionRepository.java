package com.dgsi.suivievaluationpei.repository;

import com.dgsi.suivievaluationpei.model.Prevision;
import com.dgsi.suivievaluationpei.model.Structure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrevisionRepository extends JpaRepository<Prevision, Long> {
    List<Prevision>findByStructure(Structure structure);
}

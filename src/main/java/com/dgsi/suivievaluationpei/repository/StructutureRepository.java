package com.dgsi.suivievaluationpei.repository;

import com.dgsi.suivievaluationpei.model.Structure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StructutureRepository extends JpaRepository<Structure, Integer> {
}

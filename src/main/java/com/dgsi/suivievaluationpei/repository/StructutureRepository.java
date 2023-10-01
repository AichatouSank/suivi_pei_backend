package com.dgsi.suivievaluationpei.repository;

import com.dgsi.suivievaluationpei.model.Region;
import com.dgsi.suivievaluationpei.model.Structure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StructutureRepository extends JpaRepository<Structure, Integer> {
    List<Region> findByRegions(Structure structure);
}

package com.dgsi.suivievaluationpei.service;

import com.dgsi.suivievaluationpei.model.Structure;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface StructureService {
    Structure addStructure(Structure structure);
    List<Structure> findAllStructures();
    Structure updateStructure(Structure structure);
    Structure deleteStructure(int id);
}

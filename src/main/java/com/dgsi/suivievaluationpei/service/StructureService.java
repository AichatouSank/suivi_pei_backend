package com.dgsi.suivievaluationpei.service;

import com.dgsi.suivievaluationpei.model.Structure;

import java.util.List;

public interface StructureService {
    Structure addStructure(Structure structure);
    List<Structure> findAllStructures();
    Structure updateStructure(Structure structure);
    Structure deleteStructure(int id);
}

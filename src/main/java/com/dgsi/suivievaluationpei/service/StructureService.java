package com.dgsi.suivievaluationpei.service;

import com.dgsi.suivievaluationpei.model.Structure;

public interface StructureService {
    Structure addStructure(Structure structure);
    Structure findAllStructures();
    Structure updateStructure(Structure structure);
    Structure deleteStructure(int id);
}

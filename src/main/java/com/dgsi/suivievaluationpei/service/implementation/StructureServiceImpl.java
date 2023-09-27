package com.dgsi.suivievaluationpei.service.implementation;

import com.dgsi.suivievaluationpei.model.Structure;
import com.dgsi.suivievaluationpei.repository.StructutureRepository;
import com.dgsi.suivievaluationpei.service.StructureService;
import com.sun.jdi.event.StepEvent;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StructureServiceImpl implements StructureService {
    private final StructutureRepository structutureRepository;
    @Override
    public Structure addStructure(Structure structure) {
        String nomUpperCase = structure.getNomStructure().toUpperCase();
        structure.setNomStructure(nomUpperCase);
        return structutureRepository.save(structure);
    }

    @Override
    public Structure findAllStructures() {
        return null;
    }

    @Override
    public Structure updateStructure(Structure structure) {
        return null;
    }

    @Override
    public Structure deleteStructure(int id) {
        return null;
    }
}

package com.dgsi.suivievaluationpei.service;

import com.dgsi.suivievaluationpei.model.Prevision;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PrevisionService {
    Prevision addPrevision(Prevision prevision);
    List<Prevision> getAllPrevision();
    Prevision updatePrevision(Prevision prevision);
    String deletePrevision(Long id);
    Optional<Prevision>findByAnneeBudgetaire(int annee);

    List<Prevision> findByStructure(String structure);
}

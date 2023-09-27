package com.dgsi.suivievaluationpei.service.implementation;

import com.dgsi.suivievaluationpei.model.Prevision;
import com.dgsi.suivievaluationpei.repository.PrevisionRepository;
import com.dgsi.suivievaluationpei.service.PrevisionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PrevisionServiceImpl implements PrevisionService {
    private final PrevisionRepository previsionRepository;
    @Override
    public Prevision addPrevision(Prevision prevision) {
        return previsionRepository.save(prevision);
    }

    @Override
    public List<Prevision> getAllPrevision() {
        return previsionRepository.findAll();
    }

    @Override
    public Prevision updatePrevision(Prevision prevision) {
        return previsionRepository.save(prevision);
    }

    @Override
    public String deletePrevision(Long id) {
        return null;
    }

    @Override
    public Optional<Prevision> findByAnneeBudgetaire(int annee) {
        return Optional.empty();
    }

    @Override
    public List<Prevision> findByStructure(String structure) {
        return null;
    }
}

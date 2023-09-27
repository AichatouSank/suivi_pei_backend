package com.dgsi.suivievaluationpei.service.implementation;

import com.dgsi.suivievaluationpei.model.Acquisition;
import com.dgsi.suivievaluationpei.model.ModeAcquisition;
import com.dgsi.suivievaluationpei.repository.AcquisitionRepository;
import com.dgsi.suivievaluationpei.service.AcquisitionService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AcquisitionServiceImpl implements AcquisitionService {
    private final AcquisitionRepository acquisitionRepository;
    @Override
    public Acquisition addAcquisition(Acquisition acquisition) {

        return acquisitionRepository.save(acquisition);
    }

    @Override
    public List<Acquisition> getAllAcquisition() {
        return acquisitionRepository.findAll();
    }

    @Override
    public Acquisition updateAcquisition(Acquisition acquisition) {
        return acquisitionRepository.save(acquisition);
    }

    @Override
    public String deleteAcquisitionById(Long id) {
        return "supprimer avec succèss";
    }

    @Override
    public Optional<Acquisition> findByDateAacquisiyion(LocalDate date) {
        return Optional.empty();
    }

    @Override
    public Optional<Acquisition> findByModeAcquiqition(ModeAcquisition mode) {
        return Optional.empty();
    }

    @Override
    public Optional<Acquisition> findByDateAndMode(ModeAcquisition mode, LocalDateTime date) {
        return Optional.empty();
    }
}

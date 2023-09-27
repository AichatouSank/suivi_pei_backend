package com.dgsi.suivievaluationpei.service;

import com.dgsi.suivievaluationpei.model.Acquisition;
import com.dgsi.suivievaluationpei.model.ModeAcquisition;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface AcquisitionService {
    Acquisition addAcquisition(Acquisition acquisition);
    List<Acquisition> getAllAcquisition();

    Acquisition updateAcquisition(Acquisition acquisition);
    String deleteAcquisitionById(Long id);
    Optional<Acquisition> findByDateAacquisiyion(LocalDate date);
    Optional<Acquisition> findByModeAcquiqition(ModeAcquisition mode);
    Optional<Acquisition>findByDateAndMode(ModeAcquisition mode, LocalDateTime date);
}

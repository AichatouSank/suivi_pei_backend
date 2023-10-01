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
    List<Acquisition> getAllBySortAcquisition(String field);

    Acquisition updateAcquisition(Long id, Acquisition acquisition);
    String deleteAcquisitionById(Long id);
    Optional<Acquisition> findByDateAcquisition(LocalDateTime date);
    Optional<Acquisition> findByModeAcquiqition(ModeAcquisition mode);
    Optional<Acquisition>findByDateAndMode(LocalDateTime date, ModeAcquisition mode);
    double coutTotal();
    Long countAllAcquisition();
}

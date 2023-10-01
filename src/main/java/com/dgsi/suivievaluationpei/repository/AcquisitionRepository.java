package com.dgsi.suivievaluationpei.repository;

import com.dgsi.suivievaluationpei.model.Acquisition;
import com.dgsi.suivievaluationpei.model.ModeAcquisition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

public interface AcquisitionRepository extends JpaRepository<Acquisition, Long> {
    Optional<Acquisition> findByDateAcquisition(LocalDateTime date);
    Optional<Acquisition> findByModeAcquisition(ModeAcquisition modeAcquisition);
    Optional<Acquisition> findByDateAcquisitionAndModeAcquisition(LocalDateTime date, ModeAcquisition modeAcquisition);
    double coutTotal();


}

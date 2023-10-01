package com.dgsi.suivievaluationpei.service.implementation;

import com.dgsi.suivievaluationpei.model.Acquisition;
import com.dgsi.suivievaluationpei.model.ModeAcquisition;
import com.dgsi.suivievaluationpei.repository.AcquisitionRepository;
import com.dgsi.suivievaluationpei.service.AcquisitionService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
    public List<Acquisition> getAllBySortAcquisition(String field) {
        return acquisitionRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    @Override
    public Acquisition updateAcquisition(Long id, Acquisition acquisition) {
        acquisitionRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+id + "invalid"));
        acquisition.setAcquisitionId(id);
        return acquisitionRepository.save(acquisition);
    }

    @Override
    public String deleteAcquisitionById(Long id) {
        Acquisition acquisition = acquisitionRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+id + "invalid"));
        acquisitionRepository.delete(acquisition);
        return "supprimer avec succèss";
    }

    @Override
    public Optional<Acquisition> findByDateAcquisition(LocalDateTime date) {
        Acquisition acquisition = acquisitionRepository.findByDateAcquisition(date)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "la date entrée est incorrecte ou la date de cette acquisition n'existe pas"));
        return Optional.of(acquisition);
    }

    @Override
    public Optional<Acquisition> findByModeAcquiqition(ModeAcquisition mode) {
        Acquisition acquisition = acquisitionRepository.findByModeAcquisition(mode)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "la mode d'acquisition entré est incorrect ou la mode de cette acquisition n'existe pas"));
        return Optional.of(acquisition);
    }

    @Override
    public Optional<Acquisition> findByDateAndMode( LocalDateTime date, ModeAcquisition mode) {
        Acquisition acquisition = acquisitionRepository.findByDateAcquisitionAndModeAcquisition(date,mode)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "la date entrée est incorrecte ou le mode de cette acquisition n'existe pas"));
        return Optional.of(acquisition);
    }

    @Override
    public double coutTotal() {
        return 0;
    }

    @Override
    public Long countAllAcquisition() {
        return acquisitionRepository.count();
    }
}

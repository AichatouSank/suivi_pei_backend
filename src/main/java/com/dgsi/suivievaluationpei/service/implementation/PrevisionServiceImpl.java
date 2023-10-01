package com.dgsi.suivievaluationpei.service.implementation;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.Prevision;
import com.dgsi.suivievaluationpei.repository.EquipementInformatiqueRepository;
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
    private final EquipementInformatiqueRepository equipementInformatiqueRepository;
    @Override
    public Prevision addPrevision(Prevision prevision) {
        EquipementInformatique equipementInformatique = prevision.getEquipementInformatique();
        double cout = equipementInformatiqueRepository.findByCout(equipementInformatique);
        int quantite = prevision.getQuantite();
        double coutTotal = quantite * cout;
        prevision.setCoutTotal(coutTotal);
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

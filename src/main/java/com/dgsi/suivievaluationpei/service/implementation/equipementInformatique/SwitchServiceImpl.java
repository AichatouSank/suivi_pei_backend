package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Switch;
import com.dgsi.suivievaluationpei.repository.typeEquipement.SwitchRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.SwitchService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class SwitchServiceImpl implements SwitchService {
   private final SwitchRepository switchRepository;
    @Override
    public Switch addSwitch(Switch eqsitch) {
        return switchRepository.save(eqsitch);
    }

    @Override
    public List<Switch> getAllSwitch() {
        return switchRepository.findAll();
    }

    @Override
    public Switch updateSwitch(Long id, Switch eqsitch) {
        switchRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        eqsitch.setEquipementId(id);
        return switchRepository.save(eqsitch);
    }

    @Override
    public boolean deleteSwitch(Long id) {
      Switch eq =   switchRepository.findById(id)
              .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        switchRepository.delete(eq);
        return true;
    }
}

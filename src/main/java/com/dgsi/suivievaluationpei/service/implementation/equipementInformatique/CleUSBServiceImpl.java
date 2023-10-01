package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.CleUSB;
import com.dgsi.suivievaluationpei.repository.typeEquipement.CleUSBRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.CleUSBService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Service
public class CleUSBServiceImpl implements CleUSBService {
    private final CleUSBRepository cleUSBRepository;
    @Override
    public CleUSB addCleUSB(CleUSB cleUSB) {
        return cleUSBRepository.save(cleUSB);
    }

    @Override
    public List<CleUSB> getAllCleUSB() {
        return cleUSBRepository.findAll();
    }

    @Override
    public CleUSB updateCleUSB(Long id, CleUSB cleUSB) {
        cleUSBRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        cleUSB.setEquipementId(id);
        return cleUSBRepository.save(cleUSB);
    }

    @Override
    public boolean deleteCleUSB(Long id) {
        CleUSB cleUSB = cleUSBRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
            cleUSBRepository.delete(cleUSB);
        return true;
    }
}

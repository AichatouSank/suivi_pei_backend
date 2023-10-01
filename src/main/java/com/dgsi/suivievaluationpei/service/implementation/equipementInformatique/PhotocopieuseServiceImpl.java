package com.dgsi.suivievaluationpei.service.implementation.equipementInformatique;

import com.dgsi.suivievaluationpei.model.typeEquipement.Photocopieuse;
import com.dgsi.suivievaluationpei.repository.typeEquipement.PhotocopieuseRepository;
import com.dgsi.suivievaluationpei.service.typeEquipementInformatique.PhotocopieuseService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class PhotocopieuseServiceImpl implements PhotocopieuseService {
   private final PhotocopieuseRepository photocopieuseRepository;
    @Override
    public Photocopieuse addPhotocopieuse(Photocopieuse photocopieuse) {
        return photocopieuseRepository.save(photocopieuse);
    }

    @Override
    public List<Photocopieuse> getAllPhotocopieuse() {
        return photocopieuseRepository.findAll();
    }

    @Override
    public Photocopieuse updatePhotocopieuse(Long id, Photocopieuse photocopieuse) {
        photocopieuseRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        photocopieuse.setEquipementId(id);
        return photocopieuseRepository.save(photocopieuse);
    }

    @Override
    public boolean deletePhotocopieuse(Long id) {
        Photocopieuse photocopieuse = photocopieuseRepository.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "id : "+ id +" invalid"));
        photocopieuseRepository.delete(photocopieuse);
        return true;
    }
}

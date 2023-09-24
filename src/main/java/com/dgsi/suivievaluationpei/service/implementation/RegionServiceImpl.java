package com.dgsi.suivievaluationpei.service.implementation;

import com.dgsi.suivievaluationpei.model.Region;
import com.dgsi.suivievaluationpei.repository.RegionRepository;
import com.dgsi.suivievaluationpei.service.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RegionServiceImpl implements RegionService {
    private final RegionRepository regionRepository;

    @Override
    public Region addRegion(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public List<Region> findAllRegions(PageRequest pageRequest) {
        return regionRepository.findAll();
    }

    @Override
    public Object updateRegion(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public boolean deleteRegion(int id) {
        return false;
    }
}

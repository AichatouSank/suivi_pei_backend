package com.dgsi.suivievaluationpei.service;

import com.dgsi.suivievaluationpei.model.Region;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RegionService {
    Region addRegion(Region region);
    List<Region> findAllRegions(PageRequest pageRequest);

    Object updateRegion(Region region);
     boolean deleteRegion(int id);
}

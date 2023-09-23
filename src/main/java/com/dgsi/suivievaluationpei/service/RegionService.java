package com.dgsi.suivievaluationpei.service;

import com.dgsi.suivievaluationpei.model.Region;

import java.util.List;

public interface RegionService {
    Region addRegion(Region region);
    List<Region> findAllRegions();

    Object updateRegion(Region region);
}

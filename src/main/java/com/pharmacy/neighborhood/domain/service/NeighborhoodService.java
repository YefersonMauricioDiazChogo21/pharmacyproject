package com.pharmacy.neighborhood.domain.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.neighborhood.domain.entity.Neighborhood;

public interface NeighborhoodService {

    void createNeighborhood (Neighborhood neighborhood);
    void updateNeighborhood (Neighborhood neighborhood);
}

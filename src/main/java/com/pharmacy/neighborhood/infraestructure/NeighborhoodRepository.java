package com.pharmacy.neighborhood.infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import com.pharmacy.neighborhood.domain.entity.Neighborhood;
import com.pharmacy.neighborhood.domain.service.NeighborhoodService;

public class NeighborhoodRepository implements NeighborhoodService {
    private Connection connection;

    @Override
    public void createNeighborhood (Neighborhood neighborhood) {
        throw new UnsupportedOperationException("Unimplemented method 'createCity'");
    }

    @Override
    public void updateNeighborhood (Neighborhood neighborhood){
        throw new UnsupportedOperationException("Unimplemented method 'createCity'");
    }
}

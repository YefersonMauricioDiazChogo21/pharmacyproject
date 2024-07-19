package com.pharmacy.city.infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import com.pharmacy.Database;
import com.pharmacy.city.domain.entity.City;
import com.pharmacy.city.domain.service.CityService;

public class CityRepository implements CityService {
    private Connection connection;

    // public CityRepository(){
    //     try{
    //         Properties props =new Properties();
    //         props.load(getClass().getClassLoader().getResourceAsStream("configdb.properties"));
    //         String url = props.getProperty("url");
    //         String user = props.getProperty("user");
    //         String password = props.getProperty("password");
    //         connection =DriverManager.getConnection(url,user,password);
    //     } catch (Exception e){
    //         e.printStackTrace();
    //     }
    // }

    @Override
    public void createCity (City city){
        String query = "INSERT INTO city (id,name) VALUES (?,?)";
        try(Connection connection = Database.getConnection()){
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, city.getId());
            ps.setString(2, city.getName());
            ps.executeUpdate();            
        } catch (SQLException e) {
            // TODO: handle exception
        }
        
    }

    @Override
    public void updateCity (City city){
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCity'");
    }

    @Override
    public City deleteCity (String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCity'");
    }

    @Override
    public Optional<City> findCityById(String id) {
        String query = "SELECT id, name, id_country FROM city WHERE id = ?";
        try(Connection connection = Database.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        City city = new City(rs.getInt("id"),rs.getString("name"),rs.getInt("IdCountry"));
                        return Optional.of(city);
                    }
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<City> findAllCities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllPerson'");
    }

}

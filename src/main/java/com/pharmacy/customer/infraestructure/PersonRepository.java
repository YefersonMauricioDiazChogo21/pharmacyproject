package com.pharmacy.customer.infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import com.pharmacy.customer.domain.entity.Person;
import com.pharmacy.customer.domain.service.PersonService;

public class PersonRepository implements PersonService{
    private Connection connection;

    public PersonRepository() {
        try {
            Properties props = new Properties();
            props.load(getClass().getClassLoader().getResourceAsStream("configdb.properties"));
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createPerson(Person person ){
        try {
            String query = "INSERT INTO persona (id,dnltype,name,lastname,age,?,?) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, person.getId());
            ps.setString(2, person.getName());
            ps.executeUpdate();            
        } catch (SQLException e) {
            // TODO: handle exception
        }
    }

    @Override
    public void updatePerson(Person person) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePerson'");
    }

    @Override
    public Person deletePerson (String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePerson'");
    }

    @Override
    public Optional<Person> findPersonById(String id) {
        String query = "SELECT id, nombre, apellido, email, edad, idciudad FROM persona WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        Person person = new Person (rs.getInt("id"),rs.getInt("IdTypeDocument"), rs.getString("Name"),rs.getString("Lastname"),rs.getInt("Age"), rs.getString("Name"),rs.getString("Lastname"));
                        return Optional.of(person);
                    }
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<Person> findAllPersons() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllPerson'");
    }

}

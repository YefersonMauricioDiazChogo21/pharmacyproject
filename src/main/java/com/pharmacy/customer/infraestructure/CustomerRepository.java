package com.pharmacy.customer.infraestructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
// import java.util.Properties;
// import java.sql.DriverManager;

import com.pharmacy.customer.domain.entity.Customer;
import com.pharmacy.customer.domain.service.CustomerService;
import com.pharmacy.Database;

public class CustomerRepository implements CustomerService{
    private Connection connection;

    // public PersonRepository() {
    //     try {
    //         Properties props = new Properties();
    //         props.load(getClass().getClassLoader().getResourceAsStream("configdb.properties"));
    //         String url = props.getProperty("url");
    //         String user = props.getProperty("user");
    //         String password = props.getProperty("password");
    //         connection = DriverManager.getConnection(url, user, password);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    @Override
    public void createCustomer(Customer customer ){
        String query = "INSERT INTO persona (id,id_dnl_type,customer_name,customer_last_name,age,birthdate,registration_date,id_neighborhood ) VALUES (?,?,?,?,?,?,?,?)";
        try(Connection connection = Database.getConnection()){
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, customer.getId());
            ps.setInt(2, customer.getIddocumenttype());
            ps.setString(3, customer.getName());
            ps.setString(4, customer.getLastname());
            ps.setInt(5, customer.getAge());
            ps.setString(6, customer.getBirthdate());
            ps.setString(7, customer.getRegistration_date());
            ps.setInt(8, customer.getIdneighborhood());
            ps.executeUpdate();            
        } catch (SQLException e) {
            // TODO: handle exception
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePerson'");
    }

    @Override
    public Customer deleteCustomer (String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePerson'");
    }

    @Override
    public Optional<Customer> findCustomerById(String id) {
        String query = "SELECT id, id_dnl_type, customer_name, customer_last_name, age, birthdate, registration_date,  id_neighborhood FROM customer WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        Customer customer = new Customer (rs.getInt("id"),rs.getInt("IdTypeDocument"), rs.getString("Name"),rs.getString("Lastname"),rs.getInt("Age"), rs.getString("Name"),rs.getString("Lastname"),rs.getInt("IdNeighborHood"));
                        return Optional.of(customer);
                    }
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<Customer> findAllCustomers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllPerson'");
    }

}

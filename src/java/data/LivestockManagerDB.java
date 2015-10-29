/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import businessEntities.Animal;
import businessEntities.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class LivestockManagerDB {
    
    static Connection connection;
    static Statement statement;
    
    public static void openConnection() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://livestockmanager.cif2sijmaqli.us-west-2.rds.amazonaws.com:3306/livestockmanager", "livestockmanager", "livestockpassword");
        statement = connection.createStatement();
    }
    
    public static int addUserToDB(User user) throws SQLException, NullPointerException{
        String insertUserSQL = "INSERT INTO users(firstName, surname, address, herdNumber, PAC, userName, userPassword) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(insertUserSQL);

        ps.setString(1, user.getFirstName());
        ps.setString(2, user.getSurname());
        ps.setString(3, user.getAddress());
        ps.setString(4, user.getHerdNumber());
        ps.setString(5, user.getPAC());
        ps.setString(6, user.getUsername());
        ps.setString(7, user.getPassword());

        return ps.executeUpdate();
    }
    
    public static ArrayList<Animal> getAllAnimals() throws SQLException {
        ArrayList<Animal> animals = new ArrayList<>();
        String selectSQL = "SELECT * FROM cattle";
        ResultSet rst = statement.executeQuery(selectSQL);
        while(rst.next()) {
            Animal animal = new Animal(rst.getString("tagNumber"),rst.getString("breed"),rst.getString("gender"),rst.getString("dateOfBirth")
            ,rst.getString("dateLastTBTest"),rst.getString("dateLastBRTest"),rst.getString("dateMovedIn"),rst.getDouble("purchasePrice"),rst.getDouble("salePrice"),rst.getInt("weight"));
            animals.add(animal);
        }
        return animals;

    }
    
    public static ArrayList<String> getAllAnimalTagNumber() throws SQLException{
        ArrayList<String> tagNumbers = new ArrayList<>();
        String getTagsSQL = "SELECT tagNumber from cattle";
        ResultSet rst = statement.executeQuery(getTagsSQL);
        while(rst.next()) {
            tagNumbers.add(rst.getString("tagNumber"));
        }
        return tagNumbers;
    }
    
    public static int addAnimalToDB(Animal animal) throws SQLException, NullPointerException {
        String insertAnimalSQL = "INSERT INTO cattle VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(insertAnimalSQL);
        
        ps.setString(1, animal.getTagNumber());
        ps.setString(2, animal.getBreed());
        ps.setString(3, animal.getGender());
        ps.setString(4, animal.getDateOfBirth());
        ps.setString(5, animal.getDateLastTBTest());
        ps.setString(6, animal.getDateLastBRTest());
        ps.setString(7, animal.getDateMovedIn());
        ps.setDouble(8, animal.getPurchasePrice());
        ps.setDouble(9, animal.getSalePrice());
        ps.setInt(10, animal.getWeight());
        
        return ps.executeUpdate();
    }
    
    public static void closeConnection() throws ClassNotFoundException, SQLException {
        statement.close();
        connection.close();
    }
}

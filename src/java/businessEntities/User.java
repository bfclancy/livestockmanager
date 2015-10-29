/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessEntities;

/**
 *
 * @author asus
 */
public class User {
    
    private String firstName;
    private String surname;
    private String address;
    private String herdNumber;
    private String PAC;
    private String username;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHerdNumber() {
        return herdNumber;
    }

    public void setHerdNumber(String herdNumber) {
        this.herdNumber = herdNumber;
    }

    public String getPAC() {
        return PAC;
    }

    public void setPAC(String PAC) {
        this.PAC = PAC;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String firstName, String surname, String address, String herdNumber, String PAC, String username, String password) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.herdNumber = herdNumber;
        this.PAC = PAC;
        this.username = username;
        this.password = password;
    }
}

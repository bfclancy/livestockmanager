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
public class Animal {
    
    private String tagNumber;
    private String breed;
    private String dateOfBirth;
    private String gender;
    private String dateLastTBTest;
    private String dateLastBRTest;
    private String dateMovedIn;
    private double purchasePrice;
    private double salePrice;
    private int weight;

    public Animal(String tagNumber, String breed, String gender, String dateOfBirth, String dateLastTBTest,String dateLastBRTest, 
            String dateMovedIn, double purchasePrice, double salePrice, int weight){
        this.tagNumber = tagNumber;
        this.breed = breed;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateLastTBTest = dateLastTBTest;
        this.dateLastBRTest =dateLastBRTest;
        this.dateMovedIn = dateMovedIn;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.weight = weight;
        
    }
    /**
     * @return the tagNumberdate
     */
    public String getTagNumber() {
        return tagNumber;
    }

    /**
     * @param tagNumber the tagNumber to set
     */
    public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dateLastTBTest
     */
    public String getDateLastTBTest() {
        return dateLastTBTest;
    }

    /**
     * @param dateLastTBTest the dateLastTBTest to set
     */
    public void setDateLastTBTest(String dateLastTBTest) {
        this.dateLastTBTest = dateLastTBTest;
    }

    /**
     * @return the dateLastBRTest
     */
    public String getDateLastBRTest() {
        return dateLastBRTest;
    }

    /**
     * @param dateLastBRTest the dateLastBRTest to set
     */
    public void setDateLastBRTest(String dateLastBRTest) {
        this.dateLastBRTest = dateLastBRTest;
    }

    /**
     * @return the dateMovedIn
     */
    public String getDateMovedIn() {
        return dateMovedIn;
    }

    /**
     * @param dateMovedIn the dateMovedIn to set
     */
    public void setDateMovedIn(String dateMovedIn) {
        this.dateMovedIn = dateMovedIn;
    }

    /**
     * @return the purchasePrice
     */
    public Double getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * @param purchasePrice the purchasePrice to set
     */
    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * @return the salePrice
     */
    public Double getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}

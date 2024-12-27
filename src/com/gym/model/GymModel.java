// Package declaration for the Gym System views
package com.gym.model;

/**
 *
 * @author Anish Shrestha 23048634
 */
public class GymModel {

    // Fields to store various details of a Members
    private int memberId;
    private String name;
    private short age;
    private String email;
    private String number;
    private String gender;
    private String gymTime;
    private int amount;
    private String address;

    /**
     * Constructor to initialize the GymModel with provided values.
     *
     * @param memberId The unique ID of the gym member.
     * @param name The name of the gym member.
     * @param age The age of the gym member.
     * @param email The email address of the gym member.
     * @param number The contact number of the gym member.
     * @param gender The gender of the gym member.
     * @param gymTime The preferred gym time of the member.
     * @param amount The fee amount paid by the member.
     * @param address The address of the gym member.
     */
    public GymModel(int memberId, String name, short age, String email, String number, String gender, String gymTime, int amount, String address) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.number = number;
        this.gender = gender;
        this.gymTime = gymTime;
        this.amount = amount;
        this.address = address;
    }
    // Getter methods to retrieve information about the gym member

    /**
     * Getter method to retrieve the address of the gym member.
     *
     * @return The address of the gym member.
     */
    public String getAddress() {
        return address;
    }
// Setter methods to update information about the gym member

    /**
     * Setter method to update the address of the gym member.
     *
     * @param address The new address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter method to retrieve the fee amount paid by the gym member.
     *
     * @return The fee amount.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Setter method to update the fee amount paid by the gym member.
     *
     * @param amount The new fee amount.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter method to retrieve the unique member ID.
     *
     * @return The member ID.
     */
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    /**
     * Getter method to retrieve the name of the gym member.
     *
     * @return The name of the gym member.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method to update the name of the gym member.
     *
     * @param name The new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method to retrieve the age of the gym member.
     *
     * @return The age of the gym member.
     */
    public short getAge() {
        return age;
    }

    /**
     * Setter method to update the age of the gym member.
     *
     * @param age The new age.
     */
    public void setAge(short age) {
        this.age = age;
    }

    /**
     * Getter method to retrieve the email address of the gym member.
     *
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method to update the email address of the gym member.
     *
     * @param email The new email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter method to retrieve the contact number of the gym member.
     *
     * @return The contact number.
     */
    public String getNumber() {
        return number;
    }

    /**
     * Setter method to update the contact number of the gym member.
     *
     * @param number The new contact number.
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter method to retrieve the gender of the gym member.
     *
     * @return The gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter method to update the gender of the gym member.
     *
     * @param gender The new gender.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter method to retrieve the preferred gym time of the member.
     *
     * @return The gym time.
     */
    public String getGymTime() {
        return gymTime;
    }

    /**
     * Setter method to update the preferred gym time of the member.
     *
     * @param gymTime The new gym time.
     */
    public void setGymTime(String gymTime) {
        this.gymTime = gymTime;
    }

}

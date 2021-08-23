package com.example.springdatajpah;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String ClientEmailAddress;
    private String ClientMobileNumber;
    private String ClientPhoneNumber;
    private String ClientAddress;

    public Client(){

    }

    public Client (String firstName,
                   String lastName,
                   String ClientEmailAddress,
                   String ClientMobileNumber,
                   String ClientPhoneNumber,
                   String ClientAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ClientEmailAddress = ClientEmailAddress;
        this.ClientMobileNumber = ClientMobileNumber;
        this.ClientPhoneNumber = ClientPhoneNumber;
        this.ClientAddress = ClientAddress;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getClientAddress() {
        return ClientAddress;
    }

    public String getClientEmailAddress() {
        return ClientEmailAddress;
    }

    public String getClientMobileNumber() {
        return ClientMobileNumber;
    }

    public String getClientPhoneNumber() {
        return ClientPhoneNumber;
    }

    public void setClientAddress(String clientAddress) {
        ClientAddress = clientAddress;
    }

    public void setClientEmailAddress(String clientEmailAddress) {
        ClientEmailAddress = clientEmailAddress;
    }



    public void setClientMobileNumber(String clientMobileNumber) {
        ClientMobileNumber = clientMobileNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        ClientPhoneNumber = clientPhoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email Address='" + ClientEmailAddress + '\'' +
                ", Mobile Number='" + ClientMobileNumber + '\'' +
                ", PhoneNumber='" + ClientPhoneNumber + '\'' +
                ", email Address='" + ClientAddress + '\'' +
                '}';
    }
}

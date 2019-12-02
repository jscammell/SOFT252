/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Josh
 */
public class Patient extends Users{
    
    public String first_Name;
    public String last_Name;
    public String phone_Number;
    public String address;
    public String postcode;
    public String date_Of_Birth;
    public int age;
    public String sex;
    public String nhs_Number;
    
    public Patient(String userId, String password, String first_Name, String last_Name, 
            String phone_Number, String address, String postcode, String date_Of_Birth, 
            int age, String sex, String nhs_Numnber) {
        this.userId = userId;
        this.password = password;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.phone_Number = phone_Number;
        this.address = address;
        this.postcode = postcode;
        this.date_Of_Birth = date_Of_Birth;
        this.age = age;
        this.sex = sex;
        this.nhs_Number = nhs_Number;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        if(first_Name != null && !first_Name.isEmpty()) {
        this.first_Name = first_Name;}
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        if(last_Name != null && !last_Name.isEmpty()) {
        this.last_Name = last_Name;}
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        if(phone_Number != null && !phone_Number.isEmpty()) {
        this.phone_Number = phone_Number;}
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address != null && !address.isEmpty()) {
        this.address = address;}
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        if(postcode != null && !postcode.isEmpty()) {
        this.postcode = postcode;}
    }

    public String getDate_Of_Birth() {
        return date_Of_Birth;
    }

    public void setDate_Of_Birth(String date_Of_Birth) {
        if(date_Of_Birth != null && !date_Of_Birth.isEmpty()) {
        this.date_Of_Birth = date_Of_Birth;}
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= this.age && age >= 0) {
        this.age = age;}
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex != null && !sex.isEmpty()) {
        this.sex = sex;}
    }

    public String getNhs_Number() {
        return nhs_Number;
    }

    public void setNhs_Number(String nhs_Number) {
        if(nhs_Number != null && !nhs_Number.isEmpty()) {
        this.nhs_Number = nhs_Number;}
    }
    
    
}

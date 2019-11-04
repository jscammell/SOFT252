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
public class Doctor extends Users{
    public String first_Name;
    public String last_Name;
    
    public Doctor (String userId, String password, String first_Name, String last_Name) {
        this.userId = userId;
        this.password = password;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
    }
    
}

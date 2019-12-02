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
public class Users {
    
    public String userId;
    public String password;

    
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        if(userId != null && !userId.isEmpty()) {
        this.userId = userId;}
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password != null && !password.isEmpty()) {
        this.password = password;}
    }
    
    
    
}
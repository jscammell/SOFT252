/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;


/**
 *
 * @author Josh
 */
public class getData {
    
    private ArrayList<Users>patients;
    private ArrayList <Users>administrators;
    private ArrayList<Users>secretary;
    private ArrayList<Users>doctors;
    
    public void readPatients(ArrayList<Patient>patients)throws Exception
    {
        File file = new File("C:\\Users\\test.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
          
            String userId;
            String password;
            String first_Name;
            String last_Name;
            String phone_Number;
            String address;
            String postcode;
            String date_Of_Birth;
            int age;
            String sex;
            String nhs_Number;
        
        while ((br.readLine())!=null) {
            userId = br.readLine();
            password = br.readLine();
            first_Name = br.readLine();
            last_Name = br.readLine();
            phone_Number = br.readLine();
            address = br.readLine();
            postcode = br.readLine();
            date_Of_Birth = br.readLine();
            age = Integer.parseInt(br.readLine());
            sex = br.readLine();
            nhs_Number = br.readLine();
            
            Users newpatient = new Patient(userId, password, first_Name, last_Name, phone_Number, address, postcode, date_Of_Birth, age, sex, nhs_Number); 
            
            addpatient(newpatient);
            
            patients = new ArrayList<Patient>();
        } 
    }
    
    public void addpatient(Users patient)
        {
        patients.add(patient);
        }
       
        public void removepatient(Users patient)
        {
        patients.remove(patient);
        }
}

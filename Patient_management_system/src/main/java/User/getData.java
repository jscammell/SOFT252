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
    private ArrayList<Users>secretarys;
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
            
            addPatient(newpatient);
            
            patients = new ArrayList<Patient>();
        } 
    }
    
    
    
    public void addPatient(Users patient)
        {
        patients.add(patient);
        }
       
        public void removepatient(Users patient)
        {
        patients.remove(patient);
        }       
        
        
        
        
        
       
       public void readDoctors(ArrayList<Doctor>doctors)throws Exception
    {
        File file = new File("C:\\Users\\test.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
          
        String userId;
        String password;
        String first_Name;
        String last_Name;        
        
        
        while ((br.readLine())!=null) {
            userId = br.readLine();
            password = br.readLine();
            first_Name = br.readLine();
            last_Name = br.readLine();       
            
            
            Users newdoctor = new Doctor(userId, password, first_Name, last_Name); 
            
            adddoctor(newdoctor);
            
            doctors = new ArrayList<Doctor>();
        } 
    }
    
    public void adddoctor(Users doctor)
        {
        doctors.add(doctor);
        }
       
        public void removeDoctor(Users doctor)
        {
        doctors.remove(doctor);
        }
        
        
        
        
        
        
        public void readAdministrator(ArrayList<Administrator>Administrators)throws Exception
    {
        File file = new File("C:\\Users\\test.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String userId;
        String password;       
              
        
        
        while ((br.readLine())!=null) {
            userId = br.readLine();
            password = br.readLine();             
            
            
            Users newAdministrator = new Administrator(userId, password); 
            
            addadministrator(newAdministrator);
            
            Administrators = new ArrayList<Administrator>();
        } 
    }
    
    public void addadministrator(Users administrator)
        {
        administrators.add(administrator);
        }
       
        public void removeAdministrator(Users administrator)
        {
        administrators.remove(administrator);
        }
        
        
        
        
        
        public void readSecretary(ArrayList<Secretary>Secretarys)throws Exception
    {
        File file = new File("C:\\Users\\test.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String userId;
        String password;       
              
        
        
        while ((br.readLine())!=null) {
            userId = br.readLine();
            password = br.readLine();             
            
            
            Users newSecretary = new Secretary(userId, password); 
            
            addadministrator(newSecretary);
            
            Secretarys = new ArrayList<Secretary>();
        } 
    }
    
    public void addsecretary(Users secretary)
        {
        secretarys.add(secretary);
        }
       
        public void removeSecretary(Users secretary)
        {
        secretarys.remove(secretary);
        }
        
        


}





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
public class Appointment {
public String appointment_Date;
public String patient_Name;
public String doctor_Name;
public String room_Number;

public Appointment (String appointment_Date, String patient_Name, String doctor_Name, String room_Number) {
    this.appointment_Date = appointment_Date;
    this.patient_Name = patient_Name;
    this.doctor_Name = doctor_Name;
    this.room_Number = room_Number;
}

    public String getAppointment_Date() {
        return appointment_Date;
    }

    public void setAppointment_Date(String appointment_Date) {
        if(appointment_Date != null && !appointment_Date.isEmpty()) { 
        this.appointment_Date = appointment_Date;}
    }

    public String getPatient_Name() {
        return patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        if(patient_Name != null && !patient_Name.isEmpty()) {
        this.patient_Name = patient_Name;}
    }

    public String getDoctor_Name() {
        return doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        if(doctor_Name != null && !doctor_Name.isEmpty()) {
        this.doctor_Name = doctor_Name;}
    }

    public String getRoom_Number() {
        return room_Number;
    }

    public void setRoom_Number(String room_Number) {
        if(room_Number != null && !room_Number.isEmpty()) {
        this.room_Number = room_Number;}
    }


} 
    
    


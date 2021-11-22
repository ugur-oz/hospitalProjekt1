package com.company;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private int capacity;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Nurse> nurses = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();

    public Hospital(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.doctors = doctors;
        this.nurses = nurses;
        this.patients = patients;
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void printHospitalInfo() {
        System.out.println("** Java Hospital **");
        System.out.println("** Our staff of Doctors **");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName() + " " + doctor.getSurname() + " " + doctor.getSpeciality());
        }
        System.out.println("** Our Nurses **");
        for (Nurse nurse : nurses) {
            System.out.println(nurse.getName() + " " + nurse.getSurname());
        }
        System.out.println("** Our Departments **");
        for (Department department : departments) {
            System.out.println(department.getName() + " " + department.getPatients());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void printDoctors() {

    }

    public void printNurses() {

    }

    public void printPatients() {

    }
}

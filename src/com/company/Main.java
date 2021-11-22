package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor();
        doctor1.setName("William");
        doctor1.setId(1);
        doctor1.setSurname("Kahrs");
        doctor1.setSpeciality("Surgery");

        Doctor doctor2 = new Doctor();
        doctor2.setName("Max");
        doctor2.setId(2);
        doctor2.setSurname("Kal");
        doctor2.setSpeciality("Internal Medicine");

        Doctor doctor3 = new Doctor("Kurt","Bachelor",3,"Oculist");

        Nurse nurse1 = new Nurse("Claudia", "Schmidt", 201);
        Nurse nurse2 = new Nurse("Heidi", "Klum", 202);
        Nurse nurse3 = new Nurse("Emma", "Müller", 203);
        Nurse nurse4 = new Nurse("Frieda", "Irma", 204);

        Patient patient1 = new Patient("Alfred","Alina",101,"Cancer");
        Patient patient2 = new Patient("Bodo","Karin",102,"sdbs");
        Patient patient3 = new Patient("Daniela","Cora",103,"dfg");
        Patient patient4 = new Patient("Erika","Eta",104,"ghj");
        Patient patient5 = new Patient("Eva","Gilda",105,"klhki");
        Patient patient6 = new Patient("Gisela","Grouch",106,"ewer");
        Patient patient7 = new Patient("Good","Ria",107,"xcv");
        Patient patient8 = new Patient("Richard","Sabi",108,"wrt");
        Patient patient9 = new Patient("Samuel","Ted",109,"rzj");


        Hospital hospital = new Hospital("Java Hospital",50);

        hospital.getDoctors().add(doctor1);
        hospital.getDoctors().add(doctor2);
        hospital.getDoctors().add(doctor3);

        Department department = new Department();
        department.setName("Inpatient");
        department.setCapacity(40);
        department.getPatients().add(patient1);
        department.getPatients().add(patient3);
        department.getPatients().add(patient5);
        department.getPatients().add(patient7);
        department.getPatients().add(patient9);

        Department department2 = new Department();
        department.setName("Outpatient");
        department.setCapacity(40);
        department.getPatients().add(patient2);
        department.getPatients().add(patient4);
        department.getPatients().add(patient6);
        department.getPatients().add(patient8);

        List<Department> departments = new ArrayList<>();
        departments.add(department);
        departments.add(department2);

        hospital.setDepartments(departments);
        hospital.printHospitalInfo();
    }
}

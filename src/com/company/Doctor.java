package com.company;

import java.util.Date;
import java.util.List;

public class Doctor extends Person {
    private String speciality;

    public Doctor() {

    }

    public Doctor(String name, String surname, int id, String speciality) {
        super(name, surname, id);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
package com.company;

import java.util.Date;
import java.util.List;

public class Patient extends Person {
    private String illness;

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Patient(String name, String surname, int id, String illness) {
        super(name, surname, id);
        this.illness = illness;
    }

    public Patient() {
    }
}
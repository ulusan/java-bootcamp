package com.petclinic.entity;

import java.util.Date;
//option+command+L = code line reformat
public class VetEntity extends AbstractEntity {
    private int age;
    private String name;
    private Date dateOfGraduation;

    public VetEntity(int age, String name, Date dateOfGraduation) {
        this.age = age;
        this.name = name;
        this.dateOfGraduation = dateOfGraduation;
    }
    public VetEntity(Date dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }
    //GETTER-SETTER
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(Date dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }
}

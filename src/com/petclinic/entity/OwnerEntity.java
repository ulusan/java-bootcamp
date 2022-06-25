package com.petclinic.entity;


public class OwnerEntity extends AbstractEntity {
    private String fullName;
    private Integer age;

    //GETTER-SETTER
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            this.age = 0;
        }

    }
}

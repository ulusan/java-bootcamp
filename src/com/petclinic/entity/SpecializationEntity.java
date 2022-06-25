package com.petclinic.entity;

public class SpecializationEntity extends AbstractEntity {
    private int vetId;
    public SpecializationEntity(int vetId) {
        this.vetId = vetId;
    }

    //GETTER-SETTER
    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }
}

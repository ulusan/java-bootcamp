package com.petclinic.entity;

import java.util.Date;
public class VisitEntity {
    private int animalId;
    private int vetsId;
    private Date visitDate;

    public VisitEntity(int animalId, int vetsId, Date visitDate) {
        this.animalId = animalId;
        this.vetsId = vetsId;
        this.visitDate = visitDate;
    }
    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public int getVetsId() {
        return vetsId;
    }

    public void setVetsId(int vetsId) {
        this.vetsId = vetsId;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}

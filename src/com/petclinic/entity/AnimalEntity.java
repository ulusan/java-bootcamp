package com.petclinic.entity;

import java.util.Date;

public class AnimalEntity extends AbstractEntity {
    private Integer escapeAttempts;
    private Integer speciesId;
    private Integer ownersId;
    private Boolean neutered;
    private String name;
    private Date dateOfBirth;
    private Double weightKg;

    public  AnimalEntity(Integer escapeAttempts ){
        this.escapeAttempts =  escapeAttempts;
        System.out.println(this.getEscapeAttempts());
    }

    public AnimalEntity(Integer escapeAttempts, Integer speciesId, Integer ownersId, Boolean neutered, String name, Date dateOfBirth, Double weightKg) {
        this.escapeAttempts = escapeAttempts;
        this.speciesId = speciesId;
        this.ownersId = ownersId;
        this.neutered = neutered;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.weightKg = weightKg;
    }

    public Integer getEscapeAttempts() {
        return escapeAttempts;
    }

    public void setEscapeAttempts(Integer escapeAttempts) {
        this.escapeAttempts = escapeAttempts;
    }

    public Integer getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(Integer speciesId) {
        this.speciesId = speciesId;
    }

    public Integer getOwnersId() {
        return ownersId;
    }

    public void setOwnersId(Integer ownersId) {
        this.ownersId = ownersId;
    }

    public Boolean getNeutered() {
        return neutered;
    }

    public void setNeutered(Boolean neutered) {
        this.neutered = neutered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }
}

package com.petclinic.entity;

public class SpecialityEntity {

    private Integer speciesId;

    private String name;

    //CONSTRUCTOR
    public SpecialityEntity(Integer speciesId, String name) {
        this.speciesId = speciesId;
        this.name = name;
    }

    public Integer getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(Integer speciesId) {
        this.speciesId = speciesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.petclinic.entity;

public abstract class AbstractEntity {
    private Integer Id;

    public AbstractEntity() {
    }

    public AbstractEntity(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }
    public void setId(Integer Id) {
        this.Id = Id;
    }
}

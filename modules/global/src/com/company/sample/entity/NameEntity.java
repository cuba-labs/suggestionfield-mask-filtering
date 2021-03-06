package com.company.sample.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "SAMPLE_NAME_ENTITY")
@Entity(name = "sample_NameEntity")
public class NameEntity extends StandardEntity {

    @NotNull
    @Column(name = "NAME",
            nullable = false,
            unique = true,
            length = 30)
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
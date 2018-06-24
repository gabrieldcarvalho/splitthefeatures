package com.splitthefeatures.restaurantapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(max = 200)
    private String name;

    private String address;

    private Integer cousineId;

    public Restaurant() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCousineId() {
        return cousineId;
    }

    public void setCousineId(Integer cousineId) {
        this.cousineId = cousineId;
    }
}
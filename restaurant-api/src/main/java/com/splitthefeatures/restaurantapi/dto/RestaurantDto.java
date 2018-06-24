package com.splitthefeatures.restaurantapi.dto;


/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public class RestaurantDto {
    private Integer id;

    private String name;

    private String address;

    private Integer cousineId;

    public RestaurantDto() {
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

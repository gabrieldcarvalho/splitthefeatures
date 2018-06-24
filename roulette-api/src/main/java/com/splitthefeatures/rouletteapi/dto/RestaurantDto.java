package com.splitthefeatures.rouletteapi.dto;


/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public class RestaurantDto {
    private Long id;

    private String name;

    private String address;

    private Long cousineId;

    public RestaurantDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getCousineId() {
        return cousineId;
    }

    public void setCousineId(Long cousineId) {
        this.cousineId = cousineId;
    }
}

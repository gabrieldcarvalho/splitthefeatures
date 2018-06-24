package com.splitthefeatures.rouletteapi.dto;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public class RouletteRequestDto {

    private Long cousineId;

    private String customer;

    private Long activeDays;

    public Long getCousineId() {
        return cousineId;
    }

    public void setCousineId(Long cousineId) {
        this.cousineId = cousineId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Long getActiveDays() {
        return activeDays;
    }

    public void setActiveDays(Long activeDays) {
        this.activeDays = activeDays;
    }
}

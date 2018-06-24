package com.splitthefeatures.rouletteapi.dto;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public class CouponDto {

    private Long id;

    private Long restaurantId;

    private Double discountPercentage;

    private String customer;

    private Boolean used;

    private LocalDateTime expirationDate;

    private CouponStatusEnum status;

    public CouponDto() {
    }

    public enum CouponStatusEnum {
        AVAILABLE, USED, EXPIRED
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CouponStatusEnum getStatus() {
        return status;
    }

    public void setStatus(CouponStatusEnum status) {
        this.status = status;
    }
}

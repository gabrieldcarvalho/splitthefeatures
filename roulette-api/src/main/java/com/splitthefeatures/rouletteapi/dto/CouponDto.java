package com.splitthefeatures.rouletteapi.dto;

import java.time.LocalDateTime;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public class CouponDto {

    private Long id;

    private Long restaurantId;

    private Double discountPercentage;

    private String customer;

    private LocalDateTime usageDate;

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

    public LocalDateTime getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(LocalDateTime usageDate) {
        this.usageDate = usageDate;
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

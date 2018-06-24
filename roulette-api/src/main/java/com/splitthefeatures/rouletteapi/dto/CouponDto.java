package com.splitthefeatures.rouletteapi.dto;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Entity
@Table(name = "coupon")
public class CouponDto {

    private Long id;

    private Double discountPercentage;

    private String customer;

    private Boolean used;

    private LocalDateTime expirationDate;

    private CouponStatusEnum status;

    public CouponDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public enum CouponStatusEnum {
        AVAILABLE, USED, EXPIRED
    }
}

package com.splitthefeatures.rouletteapi.domain;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Entity
@Table(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue
    private Long id;

    @Range(min = 0, max = 100)
    @Digits(integer = 100, fraction = 2)
    private Double discountPercentage;

    @Size(min = 4, max = 100)
    private String customer;

    @NotNull
    private LocalDateTime useDate;

    private LocalDateTime expirationDate;

    public Coupon() {
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

    public LocalDateTime getUseDate() {
        return useDate;
    }

    public void setUseDate(LocalDateTime useDate) {
        this.useDate = useDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }
}

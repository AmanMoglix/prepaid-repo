package com.example.prepaiddiscount.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "prepaid_discount")
public class PrepaidDiscountJPA implements Serializable {
    private static final long serialVersionUID = 4360814259390176658L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "taxonomy_code")
    private String taxonomyCode;
    @Column(name = "category_name")
    private String categorName;
    @Column(name = "brand_id")
    private String brandId;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "minimum_cart_value")
    private Integer minimumCartValue;
    @Column(name = "absolute_discount")
    private Double absoluteDiscount;
    @Column(name = "percentage_discount")
    public Double percentageDiscount;
    @Column(name = "is_deleted")
    private boolean isDeleted;

    public Integer getId() {
        return id;
    }

    public PrepaidDiscountJPA setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTaxonomyCode() {
        return taxonomyCode;
    }

    public PrepaidDiscountJPA setTaxonomyCode(String taxonomyCode) {
        this.taxonomyCode = taxonomyCode;
        return this;
    }

    public String getCategorName() {
        return categorName;
    }

    public PrepaidDiscountJPA setCategorName(String categorName) {
        this.categorName = categorName;
        return this;
    }

    public String getBrandId() {
        return brandId;
    }

    public PrepaidDiscountJPA setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }

    public String getBrandName() {
        return brandName;
    }

    public PrepaidDiscountJPA setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public Integer getMinimumCartValue() {
        return minimumCartValue;
    }

    public PrepaidDiscountJPA setMinimumCartValue(Integer minimumCartValue) {
        this.minimumCartValue = minimumCartValue;
        return this;
    }

    public Double getAbsoluteDiscount() {
        return absoluteDiscount;
    }

    public PrepaidDiscountJPA setAbsoluteDiscount(Double absoluteDiscount) {
        this.absoluteDiscount = absoluteDiscount;
        return this;
    }

    public Double getPercentageDiscount() {
        return percentageDiscount;
    }

    public PrepaidDiscountJPA setPercentageDiscount(Double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
        return this;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public PrepaidDiscountJPA setDeleted(boolean deleted) {
        isDeleted = deleted;
        return this;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

package com.example.prepaiddiscount.mongo.document;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
@Document
public class DiscountMongo implements Serializable {

    private static final long serialVersionUID = 4374241870832625980L;
    @Field("msn")
    private String msn;
    @Field("is_applicable")
    private boolean isApplicable;
    @Field("discount_in")
    private String discountIn;
    @Field("amount")
    private Integer amount;
    @Field("quantity")
    private Integer quantity;

    @Field("minimum_cart_value")
    private Integer minimumCartValue;

    public String getMsn() {
        return msn;
    }

    public DiscountMongo setMsn(String msn) {
        this.msn = msn;
        return this;
    }

    public boolean isApplicable() {
        return isApplicable;
    }

    public DiscountMongo setApplicable(boolean applicable) {
        isApplicable = applicable;
        return this;
    }

    public String getDiscountIn() {
        return discountIn;
    }

    public DiscountMongo setDiscountIn(String discountIn) {
        this.discountIn = discountIn;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public DiscountMongo setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public DiscountMongo setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Integer getMinimumCartValue() {
        return minimumCartValue;
    }

    public DiscountMongo setMinimumCartValue(Integer minimumCartValue) {
        this.minimumCartValue = minimumCartValue;
        return this;
    }
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

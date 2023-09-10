package com.example.prepaiddiscount.mongo.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
@Document(collection = "prepaid_discount")
public class PrepaidDiscountMongo implements Serializable {
    private static final long serialVersionUID = 4374241870832625980L;

    @Field("id")
    @Id
    private  String cartId;
    @Field("user_id")
    private String userId;
    @JsonProperty(value = "prepaid_discounts")
    @Indexed
    private Map<String, List<DiscountMongo>> prepaidDiscountList;

    public String getCartId() {
        return cartId;
    }

    public PrepaidDiscountMongo setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public PrepaidDiscountMongo setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Map<String, List<DiscountMongo>> getPrepaidDiscountList() {
        return prepaidDiscountList;
    }

    public PrepaidDiscountMongo setPrepaidDiscountList(Map<String, List<DiscountMongo>> prepaidDiscountList) {
        this.prepaidDiscountList = prepaidDiscountList;
        return this;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

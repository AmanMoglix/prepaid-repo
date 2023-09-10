package com.moglix.externaldb.model;

import com.moglix.reward.util.enumeration.OrderClassification;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;

public class OrderItemInvoiceDetails {
    private Integer order_id;
    private Integer supplier_id;
    private String productId;
    private String invoice_number;
    private Integer item_id;
    private Date invoiceDate;
    private Integer classification_type;
    private Float gmv;


    public OrderItemInvoiceDetails(Integer order_id, Integer supplier_id, String productId, String invoice_number, Integer item_id, Date invoiceDate, Float gmv, Integer classification_type) {
        this.order_id=order_id;
        this.supplier_id = supplier_id;
        this.productId=productId;
        this.invoice_number = invoice_number;
        this.item_id = item_id;
        this.invoiceDate = invoiceDate;
        this.gmv=gmv;
        this.classification_type=classification_type;
    }
    public static void mapFromOrderItemInvoiceDetails(OrderItemReport orderItemReport,OrderItemInvoiceDetails details){
        orderItemReport.setInvoiceNumber(details.getInvoice_number());
        orderItemReport.setOmsItemId(details.getItem_id());
        orderItemReport.setGmv(details.getGmv());
        orderItemReport.setInvoiceDate(details.getInvoiceDate());
        orderItemReport.setSupplier_id(details.getSupplier_id());
        //add order classification type
        if(details.getClassification_type()!=null){
          OrderClassification eum=  OrderClassification.getOrderClassificationName(details.getClassification_type());
          orderItemReport.setClassification_type(eum);
        }

    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public String getInvoice_number() {
        return invoice_number;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public Float getGmv() {
        return gmv;
    }

    public void setGmv(Float gmv) {
        this.gmv = gmv;
    }

    public String getProductId() {
        return productId;
    }

    public Integer getClassification_type() {
        return classification_type;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

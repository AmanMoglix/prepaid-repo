package com.moglix.externaldb.centralSync.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "moglix_sales_item_invoice")
public class SalesItemInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "item_id", nullable = false)
    private Integer itemId;

    @Column(name = "supplier_id")
    private Integer supplierId;

    @Column(name = "invoice_number", length = 45)
    private String invoiceNumber;

    @Column(name = "invoice_prefix", length = 45)
    private String invoicePrefix;

    @Column(name = "invoice_sup_id")
    private Integer invoiceSupId;

    @Column(name = "invoice_date")
    private Instant invoiceDate;

    @Column(name = "invoice_url")
    private String invoiceUrl;

    @Column(name = "invoice_only_url")
    private String invoiceOnlyUrl;

    @Column(name = "status")
    private Short status;

    @Column(name = "customer_invoice_copy")
    private String customerInvoiceCopy;

    @Column(name = "tax_invoice_url")
    private String taxInvoiceUrl;

    @Column(name = "is_taxinvoice")
    private Byte isTaxinvoice;

    @Column(name = "waybill_generated")
    private Boolean waybillGenerated;

    @Column(name = "ewaybill_flag")
    private Boolean ewaybillFlag;

    @Column(name = "attempt_flag")
    private Byte attemptFlag;

    @Column(name = "tax_percent")
    private Integer taxPercent;

    @Column(name = "transfer_price")
    private Integer transferPrice;

    @Column(name = "invoice_value")
    private Integer invoiceValue;

    @Column(name = "taxable_value")
    private Integer taxableValue;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "cancelled_at")
    private Instant cancelledAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "old_invoice_num", length = 50)
    private String oldInvoiceNum;

    @Lob
    @Column(name = "invoice_response")
    private String invoiceResponse;

    @Column(name = "invoice_status")
    private Short invoiceStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoicePrefix() {
        return invoicePrefix;
    }

    public void setInvoicePrefix(String invoicePrefix) {
        this.invoicePrefix = invoicePrefix;
    }

    public Integer getInvoiceSupId() {
        return invoiceSupId;
    }

    public void setInvoiceSupId(Integer invoiceSupId) {
        this.invoiceSupId = invoiceSupId;
    }

    public Instant getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Instant invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }

    public String getInvoiceOnlyUrl() {
        return invoiceOnlyUrl;
    }

    public void setInvoiceOnlyUrl(String invoiceOnlyUrl) {
        this.invoiceOnlyUrl = invoiceOnlyUrl;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCustomerInvoiceCopy() {
        return customerInvoiceCopy;
    }

    public void setCustomerInvoiceCopy(String customerInvoiceCopy) {
        this.customerInvoiceCopy = customerInvoiceCopy;
    }

    public String getTaxInvoiceUrl() {
        return taxInvoiceUrl;
    }

    public void setTaxInvoiceUrl(String taxInvoiceUrl) {
        this.taxInvoiceUrl = taxInvoiceUrl;
    }

    public Byte getIsTaxinvoice() {
        return isTaxinvoice;
    }

    public void setIsTaxinvoice(Byte isTaxinvoice) {
        this.isTaxinvoice = isTaxinvoice;
    }

    public Boolean getWaybillGenerated() {
        return waybillGenerated;
    }

    public void setWaybillGenerated(Boolean waybillGenerated) {
        this.waybillGenerated = waybillGenerated;
    }

    public Boolean getEwaybillFlag() {
        return ewaybillFlag;
    }

    public void setEwaybillFlag(Boolean ewaybillFlag) {
        this.ewaybillFlag = ewaybillFlag;
    }

    public Byte getAttemptFlag() {
        return attemptFlag;
    }

    public void setAttemptFlag(Byte attemptFlag) {
        this.attemptFlag = attemptFlag;
    }

    public Integer getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(Integer taxPercent) {
        this.taxPercent = taxPercent;
    }

    public Integer getTransferPrice() {
        return transferPrice;
    }

    public void setTransferPrice(Integer transferPrice) {
        this.transferPrice = transferPrice;
    }

    public Integer getInvoiceValue() {
        return invoiceValue;
    }

    public void setInvoiceValue(Integer invoiceValue) {
        this.invoiceValue = invoiceValue;
    }

    public Integer getTaxableValue() {
        return taxableValue;
    }

    public void setTaxableValue(Integer taxableValue) {
        this.taxableValue = taxableValue;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(Instant cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getOldInvoiceNum() {
        return oldInvoiceNum;
    }

    public void setOldInvoiceNum(String oldInvoiceNum) {
        this.oldInvoiceNum = oldInvoiceNum;
    }

    public String getInvoiceResponse() {
        return invoiceResponse;
    }

    public void setInvoiceResponse(String invoiceResponse) {
        this.invoiceResponse = invoiceResponse;
    }

    public Short getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Short invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

}
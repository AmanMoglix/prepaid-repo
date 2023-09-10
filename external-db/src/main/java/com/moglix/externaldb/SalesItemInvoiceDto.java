package com.moglix.externaldb;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * DTO for {@link com.moglix.externaldb.centralSync.entity.SalesItemInvoice}
 */
public class SalesItemInvoiceDto implements Serializable {
    private final Integer itemId;
    private final Integer supplierId;
    private final String invoiceNumber;
    private final Integer invoiceSupId;
    private final Timestamp invoiceDate;
    private final String invoiceUrl;
    private final Short status;
    private final Integer taxPercent;
    private final Integer invoiceValue;
    private final Integer taxableValue;
    private final Timestamp updatedAt;
    private final Short invoiceStatus;

    public SalesItemInvoiceDto(Integer itemId, Integer supplierId, String invoiceNumber, Integer invoiceSupId, Timestamp invoiceDate, String invoiceUrl, Short status, Integer taxPercent, Integer invoiceValue, Integer taxableValue, Timestamp updatedAt, Short invoiceStatus) {
        this.itemId = itemId;
        this.supplierId = supplierId;
        this.invoiceNumber = invoiceNumber;
        this.invoiceSupId = invoiceSupId;
        this.invoiceDate = invoiceDate;
        this.invoiceUrl = invoiceUrl;
        this.status = status;
        this.taxPercent = taxPercent;
        this.invoiceValue = invoiceValue;
        this.taxableValue = taxableValue;
        this.updatedAt = updatedAt;
        this.invoiceStatus = invoiceStatus;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Integer getInvoiceSupId() {
        return invoiceSupId;
    }

    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    public Short getStatus() {
        return status;
    }

    public Integer getTaxPercent() {
        return taxPercent;
    }

    public Integer getInvoiceValue() {
        return invoiceValue;
    }

    public Integer getTaxableValue() {
        return taxableValue;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public Short getInvoiceStatus() {
        return invoiceStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesItemInvoiceDto entity = (SalesItemInvoiceDto) o;
        return Objects.equals(this.itemId, entity.itemId) &&
                Objects.equals(this.supplierId, entity.supplierId) &&
                Objects.equals(this.invoiceNumber, entity.invoiceNumber) &&
                Objects.equals(this.invoiceSupId, entity.invoiceSupId) &&
                Objects.equals(this.invoiceDate, entity.invoiceDate) &&
                Objects.equals(this.invoiceUrl, entity.invoiceUrl) &&
                Objects.equals(this.status, entity.status) &&
                Objects.equals(this.taxPercent, entity.taxPercent) &&
                Objects.equals(this.invoiceValue, entity.invoiceValue) &&
                Objects.equals(this.taxableValue, entity.taxableValue) &&
                Objects.equals(this.updatedAt, entity.updatedAt) &&
                Objects.equals(this.invoiceStatus, entity.invoiceStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, supplierId, invoiceNumber, invoiceSupId, invoiceDate, invoiceUrl, status, taxPercent, invoiceValue, taxableValue, updatedAt, invoiceStatus);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "itemId = " + itemId + ", " +
                "supplierId = " + supplierId + ", " +
                "invoiceNumber = " + invoiceNumber + ", " +
                "invoiceSupId = " + invoiceSupId + ", " +
                "invoiceDate = " + invoiceDate + ", " +
                "invoiceUrl = " + invoiceUrl + ", " +
                "status = " + status + ", " +
                "taxPercent = " + taxPercent + ", " +
                "invoiceValue = " + invoiceValue + ", " +
                "taxableValue = " + taxableValue + ", " +
                "updatedAt = " + updatedAt + ", " +
                "invoiceStatus = " + invoiceStatus + ")";
    }
}
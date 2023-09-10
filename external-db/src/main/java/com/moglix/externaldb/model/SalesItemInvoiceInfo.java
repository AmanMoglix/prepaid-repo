package com.moglix.externaldb.model;

import java.sql.Timestamp;

/**
 * Projection for {@link com.moglix.externaldb.centralSync.entity.SalesItemInvoice}
 */
public interface SalesItemInvoiceInfo {
    Integer getId();

    Integer getItemId();

    Integer getSupplierId();

    String getInvoiceNumber();

    String getInvoicePrefix();

    Integer getInvoiceSupId();

    Timestamp getInvoiceDate();

    String getInvoiceUrl();

    String getInvoiceOnlyUrl();

    Short getStatus();

    String getCustomerInvoiceCopy();

    String getTaxInvoiceUrl();

    Byte getIsTaxinvoice();

    Boolean isWaybillGenerated();

    Boolean isEwaybillFlag();

    Byte getAttemptFlag();

    Integer getTaxPercent();

    Integer getTransferPrice();

    Integer getInvoiceValue();

    Integer getTaxableValue();

    Timestamp getCreatedAt();

    Timestamp getCancelledAt();

    Timestamp getUpdatedAt();

    String getOldInvoiceNum();

    String getInvoiceResponse();

    Short getInvoiceStatus();
}
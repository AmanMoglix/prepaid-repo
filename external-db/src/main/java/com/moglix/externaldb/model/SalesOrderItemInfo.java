package com.moglix.externaldb;

/**
 * Projection for {@link com.moglix.externaldb.centralSync.entity.SalesOrderItem}
 */
public interface SalesOrderItemInfo {
    Integer getOrderId();

    String getProductId();

    Short getItemStatus();

    Integer getSupplierId();

    Integer getItemPrice();

    Integer getQuantity();
}
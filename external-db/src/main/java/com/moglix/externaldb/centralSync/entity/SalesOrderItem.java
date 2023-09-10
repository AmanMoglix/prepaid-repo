package com.moglix.externaldb.centralSync.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "moglix_sales_order_item")
public class SalesOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @Column(name = "product_id", length = 45)
    private String productId;

    @Column(name = "product_ref", length = 45)
    private String productRef;

    @Column(name = "product_hsn", length = 20)
    private String productHsn;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_url")
    private String productUrl;

    @Column(name = "product_image_url")
    private String productImageUrl;

    @Column(name = "category_name", length = 100)
    private String categoryName;

    @Column(name = "category_parent_name", length = 100)
    private String categoryParentName;

    @Column(name = "product_mrp")
    private Integer productMrp;

    @Column(name = "item_status")
    private Short itemStatus;

    @Column(name = "pickup_after_cancel")
    private Boolean pickupAfterCancel;

    @Column(name = "is_gstinvoice")
    private Boolean isGstinvoice;

    @Column(name = "fulfillment_id")
    private Integer fulfillmentId;

    @Column(name = "manifest_id")
    private Integer manifestId;

    @Column(name = "liquidate_id")
    private Integer liquidateId;

    @Column(name = "tax_percent")
    private Integer taxPercent;

    @Column(name = "purchase_tax")
    private Integer purchaseTax;

    @Column(name = "tax_mismatch")
    private Boolean taxMismatch;

    @Column(name = "transfer_price")
    private Integer transferPrice;

    @Column(name = "price_fix")
    private Integer priceFix;

    @Column(name = "item_discount")
    private Integer itemDiscount;

    @Column(name = "is_emi")
    private Boolean isEmi;

    @Column(name = "emi_discount")
    private Integer emiDiscount;

    @Column(name = "supplier_id")
    private Integer supplierId;

    @Column(name = "challan_id")
    private Integer challanId;

    @Column(name = "item_price")
    private Integer itemPrice;

    @Column(name = "price_without_tax")
    private Integer priceWithoutTax;

    @Column(name = "item_shipping")
    private Integer itemShipping;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "refund_amt")
    private Integer refundAmt;

    @Column(name = "pickup_scheduled")
    private Instant pickupScheduled;

    @Column(name = "supplier_assigned_date")
    private Instant supplierAssignedDate;

    @Column(name = "initial_pickup_date")
    private Instant initialPickupDate;

    @Column(name = "pickup_instructions")
    private String pickupInstructions;

    @Column(name = "warehouse_id")
    private Integer warehouseId;

    @Column(name = "is_dropship")
    private Boolean isDropship;

    @Column(name = "rto_rtv_flag")
    private Boolean rtoRtvFlag;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "reason_id")
    private Integer reasonId;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "service_request_flag")
    private Boolean serviceRequestFlag;

    @Column(name = "exchange_id")
    private Integer exchangeId;

    @Column(name = "classification_type")
    private Byte classificationType;

    @Column(name = "vmi_type")
    private Byte vmiType;

    @Column(name = "po_url")
    private String poUrl;

    @Column(name = "tax_po_url")
    private String taxPoUrl;

    @Column(name = "hold_status", nullable = false)
    private Byte holdStatus;

    @Column(name = "invoice_copy")
    private Boolean invoiceCopy;

    @Column(name = "serial_required")
    private Boolean serialRequired;

    @Column(name = "serial_added")
    private Boolean serialAdded;

    @Column(name = "inventory_flag")
    private Boolean inventoryFlag;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Lob
    @Column(name = "old_hsn")
    private String oldHsn;

    @Lob
    @Column(name = "brand_name")
    private String brandName;

    @Lob
    @Column(name = "packaging_type")
    private String packagingType;

    @Column(name = "data_lake_sync_at")
    private Instant dataLakeSyncAt;

    @Column(name = "is_subsidiary")
    private Byte isSubsidiary;

    @Column(name = "prePaid_discount")
    private Integer prepaidDiscount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductRef() {
        return productRef;
    }

    public void setProductRef(String productRef) {
        this.productRef = productRef;
    }

    public String getProductHsn() {
        return productHsn;
    }

    public void setProductHsn(String productHsn) {
        this.productHsn = productHsn;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryParentName() {
        return categoryParentName;
    }

    public void setCategoryParentName(String categoryParentName) {
        this.categoryParentName = categoryParentName;
    }

    public Integer getProductMrp() {
        return productMrp;
    }

    public void setProductMrp(Integer productMrp) {
        this.productMrp = productMrp;
    }

    public Short getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Short itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Boolean getPickupAfterCancel() {
        return pickupAfterCancel;
    }

    public void setPickupAfterCancel(Boolean pickupAfterCancel) {
        this.pickupAfterCancel = pickupAfterCancel;
    }

    public Boolean getIsGstinvoice() {
        return isGstinvoice;
    }

    public void setIsGstinvoice(Boolean isGstinvoice) {
        this.isGstinvoice = isGstinvoice;
    }

    public Integer getFulfillmentId() {
        return fulfillmentId;
    }

    public void setFulfillmentId(Integer fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    public Integer getManifestId() {
        return manifestId;
    }

    public void setManifestId(Integer manifestId) {
        this.manifestId = manifestId;
    }

    public Integer getLiquidateId() {
        return liquidateId;
    }

    public void setLiquidateId(Integer liquidateId) {
        this.liquidateId = liquidateId;
    }

    public Integer getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(Integer taxPercent) {
        this.taxPercent = taxPercent;
    }

    public Integer getPurchaseTax() {
        return purchaseTax;
    }

    public void setPurchaseTax(Integer purchaseTax) {
        this.purchaseTax = purchaseTax;
    }

    public Boolean getTaxMismatch() {
        return taxMismatch;
    }

    public void setTaxMismatch(Boolean taxMismatch) {
        this.taxMismatch = taxMismatch;
    }

    public Integer getTransferPrice() {
        return transferPrice;
    }

    public void setTransferPrice(Integer transferPrice) {
        this.transferPrice = transferPrice;
    }

    public Integer getPriceFix() {
        return priceFix;
    }

    public void setPriceFix(Integer priceFix) {
        this.priceFix = priceFix;
    }

    public Integer getItemDiscount() {
        return itemDiscount;
    }

    public void setItemDiscount(Integer itemDiscount) {
        this.itemDiscount = itemDiscount;
    }

    public Boolean getIsEmi() {
        return isEmi;
    }

    public void setIsEmi(Boolean isEmi) {
        this.isEmi = isEmi;
    }

    public Integer getEmiDiscount() {
        return emiDiscount;
    }

    public void setEmiDiscount(Integer emiDiscount) {
        this.emiDiscount = emiDiscount;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getChallanId() {
        return challanId;
    }

    public void setChallanId(Integer challanId) {
        this.challanId = challanId;
    }

    public Integer getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getPriceWithoutTax() {
        return priceWithoutTax;
    }

    public void setPriceWithoutTax(Integer priceWithoutTax) {
        this.priceWithoutTax = priceWithoutTax;
    }

    public Integer getItemShipping() {
        return itemShipping;
    }

    public void setItemShipping(Integer itemShipping) {
        this.itemShipping = itemShipping;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(Integer refundAmt) {
        this.refundAmt = refundAmt;
    }

    public Instant getPickupScheduled() {
        return pickupScheduled;
    }

    public void setPickupScheduled(Instant pickupScheduled) {
        this.pickupScheduled = pickupScheduled;
    }

    public Instant getSupplierAssignedDate() {
        return supplierAssignedDate;
    }

    public void setSupplierAssignedDate(Instant supplierAssignedDate) {
        this.supplierAssignedDate = supplierAssignedDate;
    }

    public Instant getInitialPickupDate() {
        return initialPickupDate;
    }

    public void setInitialPickupDate(Instant initialPickupDate) {
        this.initialPickupDate = initialPickupDate;
    }

    public String getPickupInstructions() {
        return pickupInstructions;
    }

    public void setPickupInstructions(String pickupInstructions) {
        this.pickupInstructions = pickupInstructions;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Boolean getIsDropship() {
        return isDropship;
    }

    public void setIsDropship(Boolean isDropship) {
        this.isDropship = isDropship;
    }

    public Boolean getRtoRtvFlag() {
        return rtoRtvFlag;
    }

    public void setRtoRtvFlag(Boolean rtoRtvFlag) {
        this.rtoRtvFlag = rtoRtvFlag;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getReasonId() {
        return reasonId;
    }

    public void setReasonId(Integer reasonId) {
        this.reasonId = reasonId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Boolean getServiceRequestFlag() {
        return serviceRequestFlag;
    }

    public void setServiceRequestFlag(Boolean serviceRequestFlag) {
        this.serviceRequestFlag = serviceRequestFlag;
    }

    public Integer getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
    }

    public Byte getClassificationType() {
        return classificationType;
    }

    public void setClassificationType(Byte classificationType) {
        this.classificationType = classificationType;
    }

    public Byte getVmiType() {
        return vmiType;
    }

    public void setVmiType(Byte vmiType) {
        this.vmiType = vmiType;
    }

    public String getPoUrl() {
        return poUrl;
    }

    public void setPoUrl(String poUrl) {
        this.poUrl = poUrl;
    }

    public String getTaxPoUrl() {
        return taxPoUrl;
    }

    public void setTaxPoUrl(String taxPoUrl) {
        this.taxPoUrl = taxPoUrl;
    }

    public Byte getHoldStatus() {
        return holdStatus;
    }

    public void setHoldStatus(Byte holdStatus) {
        this.holdStatus = holdStatus;
    }

    public Boolean getInvoiceCopy() {
        return invoiceCopy;
    }

    public void setInvoiceCopy(Boolean invoiceCopy) {
        this.invoiceCopy = invoiceCopy;
    }

    public Boolean getSerialRequired() {
        return serialRequired;
    }

    public void setSerialRequired(Boolean serialRequired) {
        this.serialRequired = serialRequired;
    }

    public Boolean getSerialAdded() {
        return serialAdded;
    }

    public void setSerialAdded(Boolean serialAdded) {
        this.serialAdded = serialAdded;
    }

    public Boolean getInventoryFlag() {
        return inventoryFlag;
    }

    public void setInventoryFlag(Boolean inventoryFlag) {
        this.inventoryFlag = inventoryFlag;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getOldHsn() {
        return oldHsn;
    }

    public void setOldHsn(String oldHsn) {
        this.oldHsn = oldHsn;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public Instant getDataLakeSyncAt() {
        return dataLakeSyncAt;
    }

    public void setDataLakeSyncAt(Instant dataLakeSyncAt) {
        this.dataLakeSyncAt = dataLakeSyncAt;
    }

    public Byte getIsSubsidiary() {
        return isSubsidiary;
    }

    public void setIsSubsidiary(Byte isSubsidiary) {
        this.isSubsidiary = isSubsidiary;
    }

    public Integer getPrepaidDiscount() {
        return prepaidDiscount;
    }

    public void setPrepaidDiscount(Integer prepaidDiscount) {
        this.prepaidDiscount = prepaidDiscount;
    }

}
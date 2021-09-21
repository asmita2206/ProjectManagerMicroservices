package com.bluescript.inventory.response;

public class InventoryDeleteResponse {

    private String inventoryId;
    private boolean inventoryIdDeleted;

    public InventoryDeleteResponse(String inventoryId, boolean inventoryIdDeleted) {
        this.inventoryId = inventoryId;
        this.inventoryIdDeleted = inventoryIdDeleted;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public boolean isInventoryIdDeleted() {
        return inventoryIdDeleted;
    }

    public void setInventoryIdDeleted(boolean inventoryIdDeleted) {
        this.inventoryIdDeleted = inventoryIdDeleted;
    }
}

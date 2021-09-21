package com.bluescript.inventory.response;

public class InventoryEntryDeleteResponse {

    private String inventoryEntryId;
    private boolean invetoryEntryIdDeleted;

    public InventoryEntryDeleteResponse(String inventoryEntryId, boolean invetoryEntryIdDeleted) {
        this.inventoryEntryId = inventoryEntryId;
        this.invetoryEntryIdDeleted = invetoryEntryIdDeleted;
    }

    public String getInventoryEntryId() {
        return inventoryEntryId;
    }

    public void setInventoryEntryId(String inventoryEntryId) {
        this.inventoryEntryId = inventoryEntryId;
    }

    public boolean isInvetoryEntryIdDeleted() {
        return invetoryEntryIdDeleted;
    }

    public void setInvetoryEntryIdDeleted(boolean invetoryEntryIdDeleted) {
        this.invetoryEntryIdDeleted = invetoryEntryIdDeleted;
    }
}

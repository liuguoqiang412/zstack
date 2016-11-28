package org.zstack.header.vm;

import org.zstack.header.message.APIEvent;

/**
 * Created by root on 11/2/16.
 */
public class APIResumeVmInstanceEvent extends APIEvent {

    private VmInstanceInventory inventory;

    public APIResumeVmInstanceEvent() {
        super(null);
    }

    public APIResumeVmInstanceEvent(String apiId) {
        super(apiId);
    }

    public VmInstanceInventory getInventory() {
        return inventory;
    }

    public void setInventory(VmInstanceInventory inventory) {
        this.inventory = inventory;
    }
}

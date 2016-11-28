package org.zstack.header.zone;

import org.zstack.header.message.APICreateMessage;
import org.zstack.header.message.APIParam;

/**
 * @api create a new zone
 * @httpMsg {
 * "org.zstack.header.zone.APICreateZoneMsg": {
 * "session": {
 * "uuid": "b15610a241594f42a7183f82deedadba"
 * },
 * "name": "zone1",
 * "description": "Test"
 * }
 * }
 * @msg {
 * "org.zstack.header.zone.APICreateZoneMsg": {
 * "name": "TestZone",
 * "description": "Test",
 * "session": {
 * "uuid": "7a4dcadf87b94f93854cca7d3550f120"
 * },
 * "timeout": 1800000,
 * "id": "70d36c271de3441a82575dfc471b2170",
 * "serviceId": "api.portal"
 * }
 * }
 * @cli
 * @result see :ref:`APICreateZoneEvent`
 * @since 0.1.0
 */
public class APICreateZoneMsg extends APICreateMessage {
    /**
     * @desc max length of 255 characters
     * @required
     */
    @APIParam(maxLength = 255)
    private String name;
    /**
     * @desc max length of 2048 characters
     */
    @APIParam(required = false, maxLength = 2048)
    private String description;
    /**
     * @desc for now, the only zone type is 'zstack'. This field is reserved for future extension
     * @choices zstack
     */
    @APIParam(required = false, validValues = {"zstack"})
    private String type;

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

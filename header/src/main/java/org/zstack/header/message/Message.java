package org.zstack.header.message;

import com.rabbitmq.client.AMQP.BasicProperties;
import org.zstack.header.core.AsyncBackup;
import org.zstack.header.rest.APINoSee;
import org.zstack.utils.DebugUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;


public abstract class Message implements Serializable, AsyncBackup {
    /**
     * @ignore
     */
    @GsonTransient
    @APINoSee
    @NoJsonSchema
    private transient MessageProperties props;
    /**
     * @ignore
     */
    @APINoSee
    @NoJsonSchema
    private Map<String, Object> headers = new LinkedHashMap<String, Object>();
    /**
     * @ignore
     */
    @APINoSee
    private String id;
    /**
     * @ignore
     */
    @APINoSee
    private String serviceId;
    /**
     * @ignore
     */
    @APINoSee
    private long createdTime;


    public Message() {
        createdTime = System.currentTimeMillis();
        id = UUID.randomUUID().toString().replace("-", "");
    }

    public Map<String, Object> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    public void putHeaderEntry(String key, Object value) {
        headers.put(key, value);
    }

    public <T> T getHeaderEntry(String key) {
        return (T) headers.get(key);
    }

    public BasicProperties getAMQPProperties() {
        return props.toBasicProperties();
    }

    public void setAMQPProperties(BasicProperties amqpProperties) {
        props = MessageProperties.valueOf(amqpProperties);
    }

    public Map<String, Object> getAMQPHeaders() {
        DebugUtils.Assert(props != null, "AMQP properties has not been set");
        if (props.getHeaders() == null) {
            props.setHeaders(new HashMap<String, Object>());
        } else if (!(props.getHeaders() instanceof HashMap)) {
            // don't trust map generated by rabbitmq library, it may use some map type that cannot call put()
            HashMap nmap = new HashMap();
            nmap.putAll(props.getHeaders());
            props.setHeaders(nmap);
        }
        return props.getHeaders();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public String getMessageName() {
        return this.getClass().getCanonicalName();
    }

    @Override
    public boolean equals(Object t) {
        if (t == null || !(t instanceof Message)) {
            return false;
        }

        return ((Message) t).getId().equals(getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
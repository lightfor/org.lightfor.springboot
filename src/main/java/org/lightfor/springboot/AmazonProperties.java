package org.lightfor.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 注入属性
 * Created by Light on 2017/5/17.
 */
@Component
@ConfigurationProperties("amazon")
public class AmazonProperties {

    private String associateId;

    public String getAssociateId() {
        return associateId;
    }

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }
}

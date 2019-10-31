package com.enbuys.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: Pace
 * @Data: 2019/10/30 19:13
 * @Version: v1.0
 */
@ConfigurationProperties("enbuys.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}

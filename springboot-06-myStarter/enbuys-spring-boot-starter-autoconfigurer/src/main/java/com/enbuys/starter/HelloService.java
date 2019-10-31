package com.enbuys.starter;

/**
 * @Author: Pace
 * @Data: 2019/10/30 19:12
 * @Version: v1.0
 */

public class HelloService {

    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String hello(String name) {
        return helloProperties.getPrefix() + " " + name + " " + helloProperties.getSuffix();
    }
}

package com.enbuys.springboot.Entity;

/**
 * @Author: Pace
 * @Data: 2019/10/22 11:20
 * @Version: v1.0
 */
public class Dog {

    private String dName;
    private int dAge;

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getdAge() {
        return dAge;
    }

    public void setdAge(int dAge) {
        this.dAge = dAge;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dName='" + dName + '\'' +
                ", dAge=" + dAge +
                '}';
    }
}

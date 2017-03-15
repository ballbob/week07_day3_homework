package com.codeclan.listsquids;

/**
 * Created by user on 15/03/2017.
 */

public class Squid {

    private int size;
    private String commonName;
    private String binomial;

    public Squid(Integer size, String commonName, String binomial){
        this.size = size;
        this.commonName = commonName;
        this.binomial = binomial;
    }

    public int getSize() {
        return size;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getBinomial() {
        return binomial;
    }
}

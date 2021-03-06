package com.company;

/**
 * Created by RedDragon on 1/17/17.
 */
public class TestNode {

    TestNode next;
    Object data;

    public TestNode(Object data, TestNode next){
        this.data = data;
        next = next;
    }

    // without toString <- data will point to internal
    // memory
    public String toString(){
        return String.valueOf(data);
    }
}

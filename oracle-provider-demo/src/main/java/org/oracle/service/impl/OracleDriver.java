package org.oracle.service.impl;


import org.example.JDBCSpiService;

public class OracleDriver implements JDBCSpiService {

    @Override
    public void connect(String message) {
        System.out.println("连接Oracle " +message);
    }
}

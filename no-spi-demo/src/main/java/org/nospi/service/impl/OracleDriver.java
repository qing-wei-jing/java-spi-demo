package org.nospi.service.impl;

import org.nospi.service.JDBCNoSpiService;

public class OracleDriver implements JDBCNoSpiService {

    @Override
    public void connect(String message) {
        System.out.println("连接Oracle " +message);
    }
}

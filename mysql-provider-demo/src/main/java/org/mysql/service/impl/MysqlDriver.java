package org.mysql.service.impl;


import org.example.JDBCSpiService;

public class MysqlDriver implements JDBCSpiService {


    @Override
    public void connect(String message) {
        System.out.println("连接Mysql " + message);
    }
}

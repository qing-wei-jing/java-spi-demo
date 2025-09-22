package org.nospi;


import org.nospi.service.impl.MysqlDriver;
import org.nospi.service.impl.OracleDriver;
import org.nospi.utils.JDBCNoSpiUtils;

public class Main {
    public static void main(String[] args) {
        JDBCNoSpiUtils jdbcNoSPIUtils = new JDBCNoSpiUtils(new MysqlDriver());
        jdbcNoSPIUtils.connect("qqq");

    }
}
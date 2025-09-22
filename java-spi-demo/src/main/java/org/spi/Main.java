package org.spi;


import org.nospi.service.impl.MysqlDriver;
import org.nospi.utils.JDBCNoSpiUtils;
import org.spi.utils.JDBCSpiUtils;

public class Main {
    public static void main(String[] args) {
        // 不使用SPI的方式
        JDBCNoSpiUtils jdbcNoSPIUtils = new JDBCNoSpiUtils(new MysqlDriver());
        jdbcNoSPIUtils.connect("no-spi");
        // 使用SPI的方式
        JDBCSpiUtils jdbcSPIUtils = JDBCSpiUtils.getInstance();
        jdbcSPIUtils.sendRequest("spi");
    }
}
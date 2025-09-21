package org.nospi.utils;

import org.nospi.service.JDBCNoSpiService;

public class JDBCNoSpiUtils {

    //实际项目改成bean注入
    //依赖倒置原则，基于接口而不是实现类
    private JDBCNoSpiService jdbcNoSpiService;

    public JDBCNoSpiUtils() {

    }
    public JDBCNoSpiUtils(JDBCNoSpiService jdbcNoSpiService) {
        this.jdbcNoSpiService = jdbcNoSpiService;
    }

    public void connect(String message){
        jdbcNoSpiService.connect(message);

    }

    public JDBCNoSpiService getJdbcService() {
        return jdbcNoSpiService;
    }

    public void setJdbcService(JDBCNoSpiService jdbcNoSpiService) {
        this.jdbcNoSpiService = jdbcNoSpiService;
    }
}

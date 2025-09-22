package org.spi.utils;

import org.example.JDBCSpiService;

import java.util.Iterator;
import java.util.ServiceLoader;

public class JDBCSpiUtils {

    private JDBCSpiService jdbcspiService;

    public void sendRequest(String message){
        jdbcspiService.connect(message);
    }


    private static JDBCSpiUtils jdbcspiUtils;

    // 实际生产环境换成单例模式，这里简化代码
    public static JDBCSpiUtils getInstance(){
        if(jdbcspiUtils == null){
            jdbcspiUtils = new JDBCSpiUtils();
        }
        return jdbcspiUtils;
    }

    public JDBCSpiUtils() {
        //初始化时，使用Java SPI初始化具体的协议实现类
        ServiceLoader<JDBCSpiService> protocols = ServiceLoader.load(JDBCSpiService.class);
        Iterator<JDBCSpiService> iterator = protocols.iterator();
        if(iterator.hasNext()){
            jdbcspiService = iterator.next();
        }
    }

}

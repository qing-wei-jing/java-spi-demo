package org.example;

import org.apache.dubbo.common.extension.SPI;

//只有使用dubboSPI的时候这个注解才有用
@SPI
public interface JDBCSpiService {

    //里氏替换原则
    void connect(String message);
}

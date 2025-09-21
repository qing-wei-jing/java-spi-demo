package org.nospi.service;

public interface JDBCNoSpiService {

    //里氏替换原则
    void connect(String message);
}

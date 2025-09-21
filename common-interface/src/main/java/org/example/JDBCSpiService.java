package org.example;

public interface JDBCSpiService {

    //里氏替换原则
    void connect(String message);
}

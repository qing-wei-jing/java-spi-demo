package org.example;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Main {
    public static void main(String[] args) {
        //获取ExtensionLoader对象
        ExtensionLoader<JDBCSpiService> extensionLoader = ExtensionLoader.getExtensionLoader(JDBCSpiService.class);
        //通过key获取对象的实现方法
        JDBCSpiService mysqlService = extensionLoader.getExtension("mysql");
        mysqlService.connect("Hello!");
        //通过key获取对象的HttpProtocol
        JDBCSpiService oracleService = extensionLoader.getExtension("oracle");
        oracleService.connect("Hello!");
    }
}

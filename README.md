从零开始搭建了java-spi-demo，方便大家学习spi机制

项目分为以下几个模块

1. no-spi-demo 不使用spi的模块
2. spi-demo 使用spi的模块
3. common-interface 通用接口模块
4. mysql-provider-demo 是mysql的驱动实现
5. oracle-provider-demo 是oracle的驱动实现

测试用例  
在spi-demo和no-spi-demo的main方法中

如果想测试SPI的效果，可以通过替换spi-demo下面的lib目录的驱动 + pom的依赖配置项修改即可。

所有驱动的jar包，都放在driver目录中。

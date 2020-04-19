# Java 使用 Mybatis 配置模板
###### 更新时间：2020.4.19
### 注意：此工程不是 Web 工程
### FAQ：
#### 此项目无法运行？
1. 请检查 resources 目录下的 mybatis-config.xml 文件是否配置正确
2. 此项目实体类使用 lombok 如果不想使用 lombok 请在 pom.xml 中去除以下依赖
```xml
<dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.16.18</version>
</dependency>
```
如果要在 IDEA 环境下使用 lombok 请下载 lombok 插件
(在Setting > Plugins > ... 下载lombok插件)

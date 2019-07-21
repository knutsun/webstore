# Webstore demo
A webstore project built using the Spring Boot framework

# Spring Boot framework Official Documentation
https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/

# How to Run Project
- Clone repository to local computer
- Navigate to `webstore/src/main/java/com/store/StoreApplication.java`
- Select `Run` > `Run As` > `Spring Boot App`


# Project Requirements
Development environment:
- IDE: Spring Tools Suite 4 (https://spring.io/tools)
  - Install SonarLint, a code quality analyzer
    - `Help` > `Eclipse Marketplace` > `Find` "SonarLint" v4.1
- Java v10.0.2 (latest stable)(https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- Apache Maven v3.6.1 (latest stable)(https://maven.apache.org/download.cgi)
- MySQL v8.0.16 (https://dev.mysql.com/downloads/mysql/)
MacOS:
Maven setup
- `mvn --version` to verify version
- `export PATH=/Users/chaz/Developer/apache-maven-3.6.1/bin:$PATH` to set path to Maven /bin/ directory (Wherever you downloaded it to)


# Useful info
Common Maven commands
- `mvn clean dependency:tree` - to refresh your Maven dependencies if you've just added a new one and a warning/error displays
- `mvn clean compile` - to see if your project will compile

Common SQL commands
- `mysql`
- `show databases;`
- `use {database_name};`
- `show tables;`
- `describe {table_name};`

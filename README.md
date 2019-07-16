# Webstore demo
A webstore project built using the Spring Boot framework

# How to Run Project
- Clone repository to local computer
- Navigate to `webstore/src/main/java/com/store/StoreApplication.java`
- Select `Run` > `Run As` > `Spring Boot App`


# Project Requirements
Development environment:
- IDE: Spring Tools Suite 4
  - Install SonarLint, a code quality analyzer
    - Help > Eclipse Marketplace > Find `SonarLint` (current version 4.1)
- Java version 10.0.2 (latest stable)
- Apache Maven version 3.6.1 (latest stable)

Java Development Kit 8 -- https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Maven -- https://maven.apache.org/download.cgi


MacOS:
Maven setup
- `mvn --version` to verify version
- `export PATH=/Users/chaz/Developer/apache-maven-3.6.1/bin:$PATH` to set path to Maven /bin/ directory (Wherever you downloaded it to)


# Useful info
Common Maven commands
- `mvn clean dependency:tree` - to refresh your Maven dependencies if you've just added a new one and a warning/error displays
- `mvn clean compile` - to see if your project will compile

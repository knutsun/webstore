# Webstore demo
A webstore project built using the Spring Boot framework

# Spring Boot framework Official Documentation
https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/

# Cloning Webstore to IntelliJ on Windows

IntelliJ Git setup:
- To connect Git to IntelliJ enter `Ctrl Alt s` > `version control` > `Git`
- Select the `...` in the `Path to Git executable` and enter the `git.exe` file
- `git.exe` can be found in `Git` > `bin` 

Cloning to IntelliJ:
- From the main menu select `VCS` > `Checkout from version control` > `Git`
- Enter Webstore git URL in the URL text box and assign a directory(If asked sign into your Github account)
- Select `Clone` to begin installation

If necessary a JDK may need to be linked to the Webstore:
- right click `Webstore` folder > `open model settings` > `SDKs` > select `+` and add your JDK 
- Set `JDK home path` to your JDK and select `OK`

# How to Run Project in Spring Tools Suite 4 IDE
- Clone repository to local computer
- Navigate to `webstore/src/main/java/com/store/StoreApplication.java`
- Select `Run` > `Run As` > `Spring Boot App`

# How to Run Project in IntelliJ IDE
- Clone repository to local computer
- Navigate to `webstore/src/main/java/com/store/StoreApplication.java`
- Select green arrow next to `main()` method of `StoreApplication.java`
- Select `Run 'StoreApplication.main()'`

# Project Requirements
Development environment:
- IDE: Spring Tools Suite 4 (https://spring.io/tools)
  - Install SonarLint, a code quality analyzer
    - `Help` > `Eclipse Marketplace` > `Find` "SonarLint" v4.1
- Java v10.0.2 (latest stable)(https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- Apache Maven v3.6.1 (latest stable)(https://maven.apache.org/download.cgi)
- MySQL v8.0.16 (https://dev.mysql.com/downloads/mysql/)

# Maven

MacOS:

Maven setup
- `export PATH=/Users/chaz/Developer/apache-maven-3.6.1/bin:$PATH` - to set path to Maven /bin/ directory (Wherever you downloaded it to)


Common Maven commands
- `mvn -v` - test the Maven installation by checking version
- `mvn clean dependency:tree` - to refresh your Maven dependencies if you've just added a new one and a warning/error displays
- `mvn clean compile` - to see if your project will compile
- `mvn package` - The package goal will compile your Java code, run any tests, and finish by packaging the code up in a JAR file within the target directory. The name of the JAR file will be based on the project’s `<artifactId>` and `<version>`
- To execute the JAR file run: `java -jar target/____.jar`
- `mvn install` - compile, test, and package your project’s code and then copy it into the local dependency repository, ready for another project to reference it as a dependency. 
- `mvn test` - compiles and runs all classes in src/test/java with a name matching *Test 
  
# SQL
- `mysql`
- `show databases;`
- `use {database_name};`
- `show tables;`
- `describe {table_name};`

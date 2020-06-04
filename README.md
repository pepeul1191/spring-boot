# Spring Boot

## Configuración del Ambiente de Desarrollo - Ubuntu 20.04

Instalación de Java JDK 11 y Maven:

    $ sudo apt update
    $ sudo apt install openjdk-11-jdk maven

## Ejecutar la Aplicación en Maven

Ejecutar Java Main Class definido en el pom.xml

    $ mvn clean && mvn install
    
Ejecutar Spring Boot [4]    

    $ mvn spring-boot:run

```xml
<build>
    ...
    <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>
        <excludeDevtools>false</excludeDevtools>
        <mainClass>ruta.al.main.class</mainClass>
        </configuration>
    </plugin>
    ...
</build>
```

Ejecutar Main Class de manera manual:

    $ mvn clean && mvn install && mvn exec:java

```xml
<build>
    ...
    <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <version>1.2.1</version>
        <executions>
        <execution>
            <goals>
            <goal>java</goal>
            </goals>
        </execution>
        </executions>
        <configuration>
        <mainClass>ruta.al.main.class</mainClass>
        </configuration>
    </plugin>
    ...
</build>
```

### Configuración de la carpeta de archivos estáticos

Modificar el archivo 'src/main/resources/application.properties'. [2] [3]

    spring.resources.static-locations=classpath:/public

### Autoreload

Agregar en pom.xml

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <optional>true</optional>
    </dependency>
</dependencies>
```

En aplication.properties

```
spring.devtools.livereload.enabled=true
spring.devtools.restart.exclude=static/**,public/**
spring.devtools.restart.enabled=true
```

---

Fuentes:

[1] https://computingforgeeks.com/how-to-install-java-11-on-ubuntu-debian-linux/ <br>
[2] https://developpaper.com/ spring-boot-series-static-resource-configuration/ <br>
[3] https://stackoverflow.com/questions/29018892/how-add-static-web-content-in-spring-boot <br>
[4] https://github.com/spring-projects/spring-boot/issues/3315 <br>
[5] https://www.codejava.net/frameworks/spring-boot/ spring-boot-auto-reload-changes-using-livereload-and-devtools <br>
[6] https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html <br>

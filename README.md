# Spring Boot

## Configuración del Ambiente de Desarrollo

Instalación de Java JDK 11 y Maven en Ubuntu 20.04:

    $ sudo apt update
    $ sudo apt install openjdk-11-jdk maven

Instalación de Java JDK 11 y Maven en Ubuntu 16.04:

    $ sudo add-apt-repository ppa:openjdk-r/ppa
    $ sudo apt-get update
    $ sudo apt install openjdk-11-jdk

Cambiar de versión de Java:

    $ sudo update-alternatives --config java

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

### Freemaker

Ver link [7]

### Estructura de la apliacion

Ver link [8]

### Mostrar logs

Ver link [9]

### Servidor Jetty

Ver link [10]

### Filters

Ver video del link [11], [12]

### YAMLs

[14] [15]

---

Fuentes:

[1] https://computingforgeeks.com/how-to-install-java-11-on-ubuntu-debian-linux/ <br>
[2] https://developpaper.com/ spring-boot-series-static-resource-configuration/ <br>
[3] https://stackoverflow.com/questions/29018892/how-add-static-web-content-in-spring-boot <br>
[4] https://github.com/spring-projects/spring-boot/issues/3315 <br>
[5] https://www.codejava.net/frameworks/spring-boot/ spring-boot-auto-reload-changes-using-livereload-and-devtools <br>
[6] https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html <br>
[7] http://zetcode.com/springboot/freemarker/ <br>
[8] http://zetcode.com/springboot/controller/ <br>
[9] https://stackoverflow.com/questions/33744875/spring-boot-how-to-log-all-requests-and-responses-with-exceptions-in-single-pl <br>
[10] https://howtodoinjava.com/spring-boot/configure-jetty-server/ <br>
[11] https://www.youtube.com/watch?v=bDektisPQQM <br>
[12] https://www.techiedelight.com/add-custom-header-to-all-responses-spring-boot/ <br>
[13] https://code.visualstudio.com/docs/editor/tasks <br>
[14] https://www.logicbig.com/tutorials/misc/yaml/snake-yaml-loading.html <br>
[15] https://www.baeldung.com/java-snake-yaml <br>
# Spring Boot

## Configuración del Ambiente de Desarrollo - Ubuntu 20.04

Instalación de Java JDK 11 y Maven:

    $ sudo apt update
    $ sudo apt install openjdk-11-jdk maven

## Ejecutar la Aplicación en Maven

Ejecutar Java Main Class definido en el pom.xml

    $ mvn clean && mvn install && mvn exec:java -Dexec.mainClass

Ejecutar Main Class de manera manual:

    $ mvn clean && mvn install && mvn exec:java -Dexec.mainClass="ruta.al.main.class"

### Configuración de la carpeta de archivos estáticos

Modificar el archivo 'src/main/resources/application.properties'. [2] [3]

    spring.resources.static-locations=classpath:/public

---

Fuentes:

[1] https://computingforgeeks.com/how-to-install-java-11-on-ubuntu-debian-linux/
[2] https://developpaper.com/spring-boot-series-static-resource-configuration/
[3] https://stackoverflow.com/questions/29018892/how-add-static-web-content-in-spring-boot
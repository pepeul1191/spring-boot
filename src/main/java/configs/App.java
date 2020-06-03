package configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = new String[]{
        //"classpath:/META-INF/resources/", 
        //"classpath:/resources/", 
        "classpath:/static/", 
        //"classpath:/public/"
    };
    public static void main(String[] args) {
        
        SpringApplication.run(App.class, args);
    }
}
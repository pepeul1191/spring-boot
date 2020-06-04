package configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo {
    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }

    @GetMapping("/demo/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("1 +++++++");
		return String.format("Hello Demo %s!", name);
	}
}
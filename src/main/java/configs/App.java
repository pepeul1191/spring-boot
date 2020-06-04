package configs;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SpringBootApplication
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @GetMapping("/home")
  public ModelAndView home(@RequestParam(value = "name", defaultValue = "World") String name) {
    var params = new HashMap<String, Object>();
    params.put("name", name);
    return new ModelAndView("home", params);
  }

  @GetMapping("/hello")
  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    System.out.println("1 +++++++");
    return String.format("Hello %s!", name);
  }
}
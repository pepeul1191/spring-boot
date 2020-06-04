package pe.softweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demo/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("2 +++++++");
		return String.format("Hello Demo %s!", name);
		
	}
}
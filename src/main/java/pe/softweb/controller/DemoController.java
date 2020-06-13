package pe.softweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/demo")
public class DemoController 
{
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) 
  {
    return String.format("Hello Demo %s!", name);
  }
}
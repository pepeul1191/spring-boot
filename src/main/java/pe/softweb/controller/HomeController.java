package pe.softweb.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/")
public class HomeController extends ApplicationController
{
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView index() 
  {
    var params = new HashMap<String, Object>();
    System.out.println("1 ++++++++++++++++++++++++++++");
    System.out.println(this.constants.get("base_url"));
    System.out.println("2 ++++++++++++++++++++++++++++");
    params.put("constants", this.constants);
    params.put("name", "Pepe ");
    params.put("title", "Home");
    return new ModelAndView("home/index", params);
  }
}
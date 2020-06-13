package pe.softweb.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/")
public class HomeController 
{
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView index() 
  {
    var params = new HashMap<String, Object>();
    params.put("name", "Pepe");
    return new ModelAndView("home/index", params);
  }
}
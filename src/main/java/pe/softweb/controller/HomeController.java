package pe.softweb.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.softweb.config.ApplicationController;

@RestController
@RequestMapping(
  value = "/"
)
public class HomeController extends ApplicationController
{
  @RequestMapping(
    value = "/", 
    method = RequestMethod.GET,
    produces={"text/html; charset=utf-8"}  
  )
  public ModelAndView index() 
  {
    // render view
    final var params = new HashMap<String, Object>();
    params.put("constants", this.constants);
    params.put("name", "Pepe ");
    params.put("title", "Home");
    return new ModelAndView("home/index", params);
  }
}
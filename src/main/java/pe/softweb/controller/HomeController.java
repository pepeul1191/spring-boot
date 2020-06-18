package pe.softweb.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    final var locals = new HashMap<String, Object>();
    System.out.println("1 +++++++++++++++++++++++++++++++++++++");
    System.out.println(this.constants.getProperty("app.base-url"));
    System.out.println("2 +++++++++++++++++++++++++++++++++++++");
    locals.put("constants", this.constants);
    locals.put("name", "Pepe ");
    locals.put("title", "Home");
    return new ModelAndView("home/index", locals);
  }
}
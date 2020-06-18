package pe.softweb.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.softweb.helper.HomeHelper;

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
    HomeHelper helper = new HomeHelper(this.constants);
    // render view
    final var locals = new HashMap<String, Object>();
    locals.put("constants", this.constants);
    locals.put("csss", helper.indexCSS());
    locals.put("jss", helper.indexJS());
    locals.put("name", "Pepe ");
    locals.put("title", "Home");
    return new ModelAndView("home/index", locals);
  }
}
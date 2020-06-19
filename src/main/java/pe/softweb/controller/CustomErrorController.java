package pe.softweb.controller;

import java.util.HashMap;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.softweb.helper.CustomErrorHelper;

@Controller
@RequestMapping(
  value = "/error"
)
public class CustomErrorController extends ApplicationController implements ErrorController 
{
  @Override
  @RequestMapping(
    value = "/", 
    method = RequestMethod.GET
  )
  public String getErrorPath() 
  {
    return "redirect:/access";
  }

  @RequestMapping(
    value = "/access", 
    method = RequestMethod.GET,
    produces={"text/html; charset=utf-8"}  
  )
  public ModelAndView index() 
  {
    CustomErrorHelper helper = new CustomErrorHelper(this.constants);
    // render view
    final var locals = new HashMap<String, Object>();
    locals.put("constants", this.constants);
    locals.put("csss", helper.indexCSS());
    locals.put("jss", helper.indexJS());
    locals.put("name", "Pepe ");
    locals.put("title", "Home");
    return new ModelAndView("custom_error/access", locals);
  }
  /*
  @Override
  public String getErrorPath() {
    System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    return "redirect:https://www.example.com/error-404";
  }
  */
}

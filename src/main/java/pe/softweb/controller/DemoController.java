package pe.softweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pe.softweb.helper.DemoHelper;

import java.util.HashMap;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(
  value = "/demo"
)
public class DemoController extends ApplicationController
{
  @RequestMapping(
    value = "/login", 
    method = RequestMethod.GET
  )
  public ModelAndView login() 
  {
    // locals
    DemoHelper helper = new DemoHelper(this.constants);
    final var locals = new HashMap<String, Object>();
    locals.put("constants", this.constants);
    locals.put("csss", helper.loginCSS());
    locals.put("jss", helper.loginJS());
    locals.put("message", "");
    locals.put("message_color", "");
    locals.put("title", "Login");
    // view
    ModelAndView model =  new ModelAndView("demo/login", locals);
    model.setStatus(HttpStatus.ACCEPTED);
    return model;
  }

  //public ModelAndView hello(@RequestParam(value = "name", defaultValue = "World") String name) 
}
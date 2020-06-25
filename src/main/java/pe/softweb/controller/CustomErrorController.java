package pe.softweb.controller;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
 // @Override
  @RequestMapping(
    value = "/", 
    method = RequestMethod.GET
  )
  public String getErrorPathGET(HttpServletRequest request) 
  {
    return "redirect:/error/access/404";
  }

  @RequestMapping(
    value = "/", 
    method = {RequestMethod.POST, RequestMethod.PUT}
  )
  public ResponseEntity<?> getErrorPathOther(HttpServletRequest request) 
  {
    return ResponseEntity.status(404).body("Recurso no encontrado");
  }

  @RequestMapping(
    value = "/access/404", 
    method = RequestMethod.POST,
    produces={"text/html; charset=utf-8"}  
  )
  public ResponseEntity<?> access() 
  {
    return ResponseEntity.status(404).body("Recurso no encontrado");
  }

  @RequestMapping(
    value = "/access/404", 
    method = RequestMethod.GET,
    produces={"text/html; charset=utf-8"}  
  )
  public ModelAndView accessGET() 
  {
    // locals
    CustomErrorHelper helper = new CustomErrorHelper(this.constants);
    final var locals = new HashMap<String, Object>();
    locals.put("constants", this.constants);
    locals.put("csss", helper.indexCSS());
    locals.put("jss", helper.indexJS());
    locals.put("name", "Pepe ");
    locals.put("title", "Home");
    // view
    ModelAndView model =  new ModelAndView("custom_error/access", locals);
    model.setStatus(HttpStatus.NOT_FOUND);
    return model;
  }
  /*
  @Override
  public String getErrorPath() {
    System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    return "redirect:https://www.example.com/error-404";
  }
  */

  @Override
  public String getErrorPath() {
    // TODO Auto-generated method stub
    return null;
  }
}

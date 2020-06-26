package pe.softweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pe.softweb.helper.DemoHelper;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

  @RequestMapping(
    value = "/login", 
    method = RequestMethod.POST
  )
  public ModelAndView loginAccess
  (
    @RequestParam(value = "name", defaultValue = "") String name, 
    @RequestParam(value = "code", defaultValue = "") String code,
    HttpServletResponse response,
    HttpServletRequest request
  ) 
  {
    if(name.equalsIgnoreCase("") || code.equalsIgnoreCase("")){
      // locals
      DemoHelper helper = new DemoHelper(this.constants);
      final var locals = new HashMap<String, Object>();
      locals.put("constants", this.constants);
      locals.put("csss", helper.loginCSS());
      locals.put("jss", helper.loginJS());
      locals.put("message", "Debe ingresar su nombre y código de alumno");
      locals.put("message_color", "text-danger");
      locals.put("title", "Login");
      // view
      ModelAndView model =  new ModelAndView("demo/login", locals);
      model.setStatus(HttpStatus.ACCEPTED);
      return model;
    }else{
      // set session
      HttpSession session = request.getSession();
      session.setAttribute("name", name);
      session.setAttribute("code", code);
      // redirect url
      ModelAndView model =  new ModelAndView("redirect:/demo/pokemon");
      // ModelAndView model =  new ModelAndView("redirect:/demo/teacher");
      model.setStatus(HttpStatus.ACCEPTED);
      return model;
    }
  }

  @RequestMapping(
    value = "/pokemon", 
    method = RequestMethod.GET
  )
  public ModelAndView pokemon(HttpServletRequest request) 
  {
    // session
    
    HttpSession session = request.getSession();
    // String name = String.valueOf(session.getAttribute("name"));
    String name = ((String.valueOf(session.getAttribute("name")).equalsIgnoreCase("null")) ? "Pepe Valdivia" : String.valueOf(session.getAttribute("name")));
    String code = ((String.valueOf(session.getAttribute("code")).equalsIgnoreCase("null")) ? "20051191" : String.valueOf(session.getAttribute("code")));
    // locals
    DemoHelper helper = new DemoHelper(this.constants);
    final var locals = new HashMap<String, Object>();
    locals.put("constants", this.constants);
    locals.put("csss", helper.pokemonCSS());
    locals.put("jss", helper.pokemonJS());
    locals.put("name", name);
    locals.put("code", code);
    locals.put("title", "Pokemones");
    // view
    ModelAndView model =  new ModelAndView("demo/pokemon", locals);
    model.setStatus(HttpStatus.ACCEPTED);
    return model;
  }

  //public ModelAndView hello(@RequestParam(value = "name", defaultValue = "World") String name) 
}
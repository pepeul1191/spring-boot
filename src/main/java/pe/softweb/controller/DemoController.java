package pe.softweb.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pe.softweb.config.Database;
import pe.softweb.helper.DemoHelper;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.json.JSONArray;
import org.springframework.http.HttpStatus;
import pe.softweb.model.demo.Carrer;
import pe.softweb.model.demo.Pokemon;
import pe.softweb.model.demo.Type;
import pe.softweb.model.demo.VWTeacherCarrer;

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
    final DemoHelper helper = new DemoHelper(this.constants);
    final var locals = new HashMap<String, Object>();
    locals.put("constants", this.constants);
    locals.put("csss", helper.loginCSS());
    locals.put("jss", helper.loginJS());
    locals.put("message", "");
    locals.put("message_color", "");
    locals.put("title", "Login");
    // view
    final ModelAndView model =  new ModelAndView("demo/login", locals);
    model.setStatus(HttpStatus.ACCEPTED);
    return model;
  }

  @RequestMapping(
    value = "/login", 
    method = RequestMethod.POST
  )
  public ModelAndView loginAccess
  (
    @RequestParam(value = "name", defaultValue = "") final String name, 
    @RequestParam(value = "code", defaultValue = "") final String code,
    final HttpServletResponse response,
    final HttpServletRequest request
  ) 
  {
    if(name.equalsIgnoreCase("") || code.equalsIgnoreCase("")){
      // locals
      final DemoHelper helper = new DemoHelper(this.constants);
      final var locals = new HashMap<String, Object>();
      locals.put("constants", this.constants);
      locals.put("csss", helper.loginCSS());
      locals.put("jss", helper.loginJS());
      locals.put("message", "Debe ingresar su nombre y código de alumno");
      locals.put("message_color", "text-danger");
      locals.put("title", "Login");
      // view
      final ModelAndView model =  new ModelAndView("demo/login", locals);
      model.setStatus(HttpStatus.ACCEPTED);
      return model;
    }else{
      // set session
      final HttpSession session = request.getSession();
      session.setAttribute("name", name);
      session.setAttribute("code", code);
      // redirect url
      // ModelAndView model =  new ModelAndView("redirect:/demo/pokemon");
      ModelAndView model =  new ModelAndView("redirect:/demo/teacher");
      model.setStatus(HttpStatus.ACCEPTED);
      return model;
    }
  }

  // POKEMONS +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

  @RequestMapping(
    value = "/pokemon", 
    method = RequestMethod.GET
  )
  public ModelAndView pokemon(final HttpServletRequest request) 
  {
    // get session
    final HttpSession session = request.getSession();
    final String name = ((String.valueOf(session.getAttribute("name")).equalsIgnoreCase("null")) ? "Pepe Valdivia" : String.valueOf(session.getAttribute("name")));
    final String code = ((String.valueOf(session.getAttribute("code")).equalsIgnoreCase("null")) ? "20051191" : String.valueOf(session.getAttribute("code")));
    // locals
    final DemoHelper helper = new DemoHelper(this.constants);
    final var locals = new HashMap<String, Object>();
    locals.put("constants", this.constants);
    locals.put("csss", helper.pokemonCSS());
    locals.put("jss", helper.pokemonJS());
    locals.put("name", name);
    locals.put("code", code);
    locals.put("title", "Pokemones");
    // view
    final ModelAndView model =  new ModelAndView("demo/pokemon", locals);
    model.setStatus(HttpStatus.ACCEPTED);
    return model;
  }

  // http://localhost:8080/demo/pokemon/type/list
  @RequestMapping(
    value = "/pokemon/type/list", 
    method = RequestMethod.GET,
    produces={"text/html; charset=utf-8"}  
  )
  public ResponseEntity<String> pokemonTypelist() 
  {
    String response = "";
    HttpStatus status = HttpStatus.OK;
    final Database db = new Database();
    try {
      db.open();
      response = Type.findAll().toJson(true).toString();
    }catch (final Exception e) {
      e.printStackTrace();
      final JSONArray error = new JSONArray();
      error.put("Se ha producido un error en listar los tipos de pokemones");
      error.put(e.toString());
      response = error.toString();
      status = HttpStatus.INTERNAL_SERVER_ERROR;
    } finally {
      if(db.getDb().hasConnection()){
        db.close();
      }
    }
    return new ResponseEntity<>(response, status);
  }

  // http://localhost:8080/demo/pokemon/search/AGUA?name=d
  @RequestMapping(
    value = "/pokemon/search/{type}", 
    method = RequestMethod.GET,
    produces={"text/html; charset=utf-8"}  
  )
  public ResponseEntity<String> pokemonSearch(
    @RequestParam(value = "name", defaultValue = "") String name,
    @PathVariable(value = "type") String type
  ) 
  {
    String response = "";
    HttpStatus status = HttpStatus.OK;
    Database db = new Database();
    try {
      db.open();
      name = "%" + name + "%";
      response = Pokemon.where("(type_1 = ? OR type_2 = ?) AND name LIKE ?", type, type, name).toJson(true).toString();
    }catch (Exception e) {
      e.printStackTrace();
      JSONArray error = new JSONArray();
      error.put("Se ha producido un error en listar los tipos de pokemones");
      error.put(e.toString());
      response = error.toString();
      status = HttpStatus.INTERNAL_SERVER_ERROR;
    } finally {
      if(db.getDb().hasConnection()){
        db.close();
      }
    }
    return new ResponseEntity<>(response, status);
  }

  // TEACHERS +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

  @RequestMapping(
    value = "/teacher", 
    method = RequestMethod.GET
  )
  public ModelAndView teacher(final HttpServletRequest request) 
  {
    // get session
    final HttpSession session = request.getSession();
    final String name = ((String.valueOf(session.getAttribute("name")).equalsIgnoreCase("null")) ? "Pepe Valdivia" : String.valueOf(session.getAttribute("name")));
    final String code = ((String.valueOf(session.getAttribute("code")).equalsIgnoreCase("null")) ? "20051191" : String.valueOf(session.getAttribute("code")));
    // locals
    final DemoHelper helper = new DemoHelper(this.constants);
    final var locals = new HashMap<String, Object>();
    locals.put("constants", this.constants);
    locals.put("csss", helper.teacherCSS());
    locals.put("jss", helper.teacherJS());
    locals.put("name", name);
    locals.put("code", code);
    locals.put("title", "Profes");
    // view
    final ModelAndView model =  new ModelAndView("demo/teacher", locals);
    model.setStatus(HttpStatus.ACCEPTED);
    return model;
  }

  // http://localhost:8080/demo/carrer/list
  @RequestMapping(
    value = "/carrer/list", 
    method = RequestMethod.GET,
    produces={"text/html; charset=utf-8"}  
  )
  public ResponseEntity<String> carrerList() 
  {
    String response = "";
    HttpStatus status = HttpStatus.OK;
    final Database db = new Database();
    try {
      db.open();
      response = Carrer.findAll().toJson(true).toString();
    }catch (final Exception e) {
      e.printStackTrace();
      final JSONArray error = new JSONArray();
      error.put("Se ha producido un error en listar las carreras");
      error.put(e.toString());
      response = error.toString();
      status = HttpStatus.INTERNAL_SERVER_ERROR;
    } finally {
      if(db.getDb().hasConnection()){
        db.close();
      }
    }
    return new ResponseEntity<>(response, status);
  }

  //http://localhost:8080/demo/teacher/carrer/8/search?name=
  @RequestMapping(
    value = "/teacher/{carrerId}/search", 
    method = RequestMethod.GET,
    produces={"text/html; charset=utf-8"}  
  )
  public ResponseEntity<String> teacherSearch(
    @RequestParam(value = "name", defaultValue = "") String name,
    @PathVariable(value = "carrerId") int carrerId
  ) 
  {
    String response = "";
    HttpStatus status = HttpStatus.OK;
    Database db = new Database();
    try {
      db.open();
      name = "%" + name + "%";
      response = VWTeacherCarrer.where("(names LIKE ? OR last_names LIKE ?) AND carrer_id = ? GROUP BY teacher_id", name, name, carrerId).orderBy("teacher_id").toJson(true).toString();
    }catch (Exception e) {
      e.printStackTrace();
      JSONArray error = new JSONArray();
      error.put("Se ha producido un error en listar los profes");
      error.put(e.toString());
      response = error.toString();
      status = HttpStatus.INTERNAL_SERVER_ERROR;
    } finally {
      if(db.getDb().hasConnection()){
        db.close();
      }
    }
    return new ResponseEntity<>(response, status);
  }
  //public ModelAndView hello(@RequestParam(value = "name", defaultValue = "World") String name) 
}
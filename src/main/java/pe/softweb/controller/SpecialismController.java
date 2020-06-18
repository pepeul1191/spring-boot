package pe.softweb.controller;

import org.json.JSONArray;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.softweb.config.Database;
import pe.softweb.model.Specialism;

@RestController
@RequestMapping(
  value = "/specialism"
)
public class SpecialismController extends ApplicationController
{
  @RequestMapping(
    value = "/list", 
    method = RequestMethod.GET,
    produces={"text/html; charset=utf-8"}  
  )
  public ResponseEntity<String> list() 
  {
    String response = "";
    HttpStatus status = HttpStatus.OK;
    Database db = new Database();
    try {
      db.open();
      response = Specialism.findAll().toJson(true).toString();
    }catch (Exception e) {
      e.printStackTrace();
      JSONArray error = new JSONArray();
      error.put("Se ha producido un error en listar las especialidades");
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
}
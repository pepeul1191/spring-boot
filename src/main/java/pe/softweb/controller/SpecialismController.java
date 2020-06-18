package pe.softweb.controller;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
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
    String rpta = "";
    Database db = new Database();
    /*
    try {
      List<JSONObject> rptaTemp = new ArrayList<JSONObject>();
      db.open();
      List<Specialism> rptaList = Specialism.findAll();
      System.out.println("1 ++++++++++++++++++++++++++");
      for(Specialism p: rptaList){   //<==== this line of code will initiate the actual query to DB
        System.out.println(p);
      }
      System.out.println("2 ++++++++++++++++++++++++++");
      for (Specialism modulo : rptaList) {
        System.out.println("++++++++++++++++++++++++++");
        JSONObject obj = new JSONObject();
        obj.put("id", modulo.get("id"));
        obj.put("name", modulo.get("name"));
        rptaTemp.add(obj);
      }
      rpta = rptaTemp.toString();
    }catch (Exception e) {
      e.printStackTrace();
      String[] error = {"Se ha producido un error en listar las especialidades", e.toString()};
      JSONObject rptaTry = new JSONObject();
      rptaTry.put("tipo_mensaje", "error");
      rptaTry.put("mensaje", error);
      rpta = rptaTry.toString();
    } finally {
      db.close();
    }
    */
    return new ResponseEntity<>("Hello World!", HttpStatus.NOT_FOUND);
  }
}
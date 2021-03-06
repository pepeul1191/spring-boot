package pe.softweb.helper;

import java.util.Properties;

public class DemoHelper extends ApplicationHelper
{
  public DemoHelper(Properties constants)
  {
    super(constants);
  }

  public String[] loginCSS() 
  {
    if(constants.getProperty("app.static-env").equalsIgnoreCase("dev")){
      return new String[] {
        "bower_components/bootstrap/dist/css/bootstrap.min",
        "assets/demo/css/styles",
        "assets/demo/css/login",
      };  
    }else{
      return new String[] {
        "bower_components/bootstrap/dist/css/bootstrap.min",
        "assets/demo/css/styles",
        "assets/demo/css/login",
      };
    }
    
  }

  public String[] loginJS() 
  {
    if(constants.getProperty("app.static-env").equalsIgnoreCase("dev")){
      return new String[] {
        "/assets/demo/js/login"
      };  
    }else{
      return new String[] {
        "/assets/demo/js/login"
      };
    }
  }  

  public String[] pokemonCSS() 
  {
    if(constants.getProperty("app.static-env").equalsIgnoreCase("dev")){
      return new String[] {
        "bower_components/bootstrap/dist/css/bootstrap.min",
        "assets/demo/css/styles",
        "assets/demo/css/pokemon",
      };  
    }else{
      return new String[] {
        "bower_components/bootstrap/dist/css/bootstrap.min",
        "assets/demo/css/styles",
        "assets/demo/css/pokemon",
      };
    }
    
  }

  public String[] pokemonJS() 
  {
    if(constants.getProperty("app.static-env").equalsIgnoreCase("dev")){
      return new String[] {
        "/assets/demo/js/pokemon"
      };  
    }else{
      return new String[] {
        "/assets/demo/js/pokemon"
      };
    }
  }  

  public String[] teacherCSS() 
  {
    if(constants.getProperty("app.static-env").equalsIgnoreCase("dev")){
      return new String[] {
        "bower_components/bootstrap/dist/css/bootstrap.min",
        "assets/demo/css/styles",
        "assets/demo/css/teacher",
      };  
    }else{
      return new String[] {
        "bower_components/bootstrap/dist/css/bootstrap.min",
        "assets/demo/css/styles",
        "assets/demo/css/teacher",
      };
    }
    
  }

  public String[] teacherJS() 
  {
    if(constants.getProperty("app.static-env").equalsIgnoreCase("dev")){
      return new String[] {
        "/assets/demo/js/teacher"
      };  
    }else{
      return new String[] {
        "/assets/demo/js/teacher"
      };
    }
  }  
}
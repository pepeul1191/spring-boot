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
}
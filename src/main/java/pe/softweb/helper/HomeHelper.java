package pe.softweb.helper;

import java.util.Properties;

public class HomeHelper extends ApplicationHelper
{
  public HomeHelper(Properties constants)
  {
    super(constants);
  }

  public String[] indexCSS() 
  {
    return new String[] {
      "bower_components/bootstrap/dist/css/bootstrap.min",
      "bower_components/font-awesome/css/font-awesome.min",
      "bower_components/swp-backbone/assets/css/constants",
      "bower_components/swp-backbone/assets/css/dashboard",
      "bower_components/swp-backbone/assets/css/table",
      "assets/css/constants",
      "assets/css/styles",
    };
  }

  public String[] indexJS() 
  {
    return new String[] {
      "jquery",
      "app",
    };
  }
}
package pe.softweb.helper;

import java.util.Properties;

public class CustomErrorHelper extends ApplicationHelper
{
  public CustomErrorHelper(Properties constants)
  {
    super(constants);
  }

  public String[] indexCSS() 
  {
    return new String[] {
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
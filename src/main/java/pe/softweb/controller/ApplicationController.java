package pe.softweb.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class ApplicationController 
{
  protected Properties constants;

  public ApplicationController()
  {
    try (InputStream input = new FileInputStream("src/main/resources/application.properties")) {
      this.constants = new Properties();
      this.constants.load(input);
      //System.out.println(prop.getProperty("db.password"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
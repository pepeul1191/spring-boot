package pe.softweb.helper;

import java.util.Properties;

public abstract class ApplicationHelper 
{
  protected Properties constants;

  public ApplicationHelper(Properties constants)
  {
    this.constants = constants;
  }
}
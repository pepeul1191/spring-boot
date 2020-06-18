package pe.softweb.config;

import java.io.InputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public abstract class ApplicationController 
{
  protected Map<String, Object> constants;

  public ApplicationController()
  {
    // load constants.yml
    Yaml yaml = new Yaml();
    InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("contents/_constants.yml");
    this.constants = yaml.load(inputStream);
  }
}
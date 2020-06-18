package pe.softweb.config;

import java.io.InputStream;
import java.util.Map;
import org.javalite.activejdbc.DB;
import org.javalite.activejdbc.DBException;
import org.json.JSONObject;
import org.yaml.snakeyaml.Yaml;

public class Database{
  private DB db;
	
  public Database(){
    this.db = new DB();
  }

  public DB getDb(){
    return this.db; 
  }

  public void open() throws DBException{
    // read yaml and parse to json
    Yaml yaml = new Yaml();
    InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("contents/_databases.yml");    
    Map<String, Object>  temp = yaml.load(inputStream);
    JSONObject databaseParams = new JSONObject(temp);
    // Database instance
    String driver = databaseParams.getJSONObject("demo").getString("driver");
    String url = databaseParams.getJSONObject("demo").getString("url");
    String user = databaseParams.getJSONObject("demo").getString("user");
    String password = databaseParams.getJSONObject("demo").getString("password");
	  this.db.open(driver, url, user, password);
  }

  public void close(){
    this.db.close();
  }
}
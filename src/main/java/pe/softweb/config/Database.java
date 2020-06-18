package pe.softweb.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.javalite.activejdbc.DB;
import org.javalite.activejdbc.DBException;
import java.util.Properties;

public class Database {
  private DB db;

  public Database() {
    this.db = new DB();
  }

  public DB getDb() {
    return this.db;
  }

  public void open() throws DBException, IOException {
    InputStream input = new FileInputStream("src/main/resources/application.properties");
    Properties properties = new Properties();
    properties.load(input);
    // Database instance
    String driver = properties.getProperty("db.driver");
    String url = properties.getProperty("db.url");
    String user = properties.getProperty("db.user");
    String password = properties.getProperty("db.password");
	  this.db.open(driver, url, user, password);
  }

  public void close(){
    this.db.close();
  }
}
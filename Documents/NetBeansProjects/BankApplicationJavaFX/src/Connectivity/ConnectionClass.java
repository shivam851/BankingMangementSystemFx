/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author acer
 */
public class ConnectionClass {
    String dbName="bank";
    String userName="root";
    String password="";
  public  Connection connection;  
  public Connection getConnection(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          connection=DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);
          
      }catch(Exception e){
       e.printStackTrace();
  }
      return connection;
}
}
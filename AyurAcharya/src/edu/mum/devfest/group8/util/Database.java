package edu.mum.devfest.group8.util;

import com.mysql.jdbc.Connection;
public class Database {
      public static Connection getConnection() {
          try  {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection
                      ("jdbc:mysql://localhost:3306/Eyob","root","root");
              return con;
          }
          catch(Exception ex) {
              System.out.println("Database.getConnection() Error -->" + ex.getMessage());
              return null;									
          }
      }
 
       public static void close(Connection con) {
          try  {
              con.close();
          }
          catch(Exception ex) {
          }
      }
}

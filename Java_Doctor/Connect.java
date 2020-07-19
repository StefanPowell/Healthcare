import java.sql.*;  

public class Connect {
   public static void main(String []args) {
      Connection conn2 = null;

      try{  
         String url2 = "jdbc:mysql://localhost:3306/test2?user=root&password=secret";

         conn2 = DriverManager.getConnection(url2);

         if (conn2 != null) {

            System.out.println("Connected to the database test2");
         }
         }
      catch(Exception e)
         { 
            System.out.println(e);
         } 
   }
}



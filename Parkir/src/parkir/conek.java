
package parkir;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class conek {
   public static Connection parkir;
   
   public static Connection GetConnection()throws SQLException{
       if (parkir==null){
           new Driver();
           
         parkir=DriverManager.getConnection("jdbc:mysql://localhost:3306/parkir","root","");
       }
       return parkir;
   }
}


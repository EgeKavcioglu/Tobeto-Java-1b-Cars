package Cars.dataAccess;

import Cars.entities.Car;

public class JdbcCarDao implements CarDao {
     public void add(Car car) {
    	 System.out.println("JDBC ile veritabanına eklendi");
    	 
    	 
     }
}

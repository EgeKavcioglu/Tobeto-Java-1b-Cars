package Cars.dataAccess;

import Cars.entities.Car;

public class HibernateCarDao implements CarDao {
     public void add(Car car) {
    	 System.out.println("Hibernate ile veritabanına eklendi");
     
     }
     
}

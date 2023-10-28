package Cars;

import Cars.business.CarService;
import Cars.core.logging.DatabaseLogger;
import Cars.core.logging.FileLogger;
import Cars.core.logging.Logger;
import Cars.core.logging.MailLogger;
import Cars.dataAccess.HibernateCarDao;
import Cars.dataAccess.JdbcCarDao;
import Cars.entities.Car;

public class Main {

	public static void main(String[] args) throws Exception {
		Car car1 = new Car(9,"3 series","Grey","2003");
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CarService carService = new CarService(new HibernateCarDao(),loggers);
		carService.add(car1); 
		

	}

}

package Cars.business;

import java.util.List;

import Cars.core.logging.Logger;
import Cars.dataAccess.HibernateCarDao;
import Cars.dataAccess.JdbcCarDao;
import Cars.dataAccess.CarDao;
import Cars.entities.Car;

public class CarService {
	private CarDao carDao;
	private Logger[] loggers;

	public CarService(CarDao carDao, Logger[] loggers) {
		this.carDao = carDao;
		this.loggers = loggers;
	}

	public void add(Car car) throws Exception {
		if (car.getId() < 8) {
			throw new Exception("Araba kimliği 8 den küçük olamaz");
		}
		carDao.add(car);
		
		for (Logger logger : loggers) {
			logger.log(car.getName());
		}

	}
}

package springiii.interfaces;

import springiii.entity.Vehicle;

import java.util.Date;
import java.util.List;

public interface IVehicleService {
    List<Vehicle> getAll();
    Vehicle get(String board);
    List<Vehicle> getForPrice(double since, double to);
    List<Vehicle> getForDate(Date since, Date to);
    Vehicle create(Vehicle vehicle);
}

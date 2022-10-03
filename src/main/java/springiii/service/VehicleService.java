package springiii.service;

import springiii.entity.Vehicle;
import springiii.interfaces.IVehicleService;

import java.util.Date;
import java.util.List;

public class VehicleService implements IVehicleService {
    @Override
    public List<Vehicle> getAll() {
        return null;
    }

    @Override
    public Vehicle get(String board) {
        return null;
    }

    @Override
    public List<Vehicle> getForPrice(double since, double to) {
        return null;
    }

    @Override
    public List<Vehicle> getForDate(Date since, Date to) {
        return null;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return null;
    }
}

package springiii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springiii.entity.Vehicle;
import springiii.exception.NotFoundException;
import springiii.interfaces.IVehicleService;
import springiii.repository.VehicleRepo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements IVehicleService {

    @Autowired
    private VehicleRepo repo;

    @Override
    public List<Vehicle> getAll() {
        return repo.getAll();
    }

    @Override
    public Vehicle get(String board) {
        Optional<Vehicle> vehicle = repo.get(board);

        if (vehicle.isEmpty()) {
            throw new NotFoundException("Veículo não encontrado");
        }

        return vehicle.get();
    }

    @Override
    public List<Vehicle> getForPrice(double since, double to) {
        return repo.getForPrice(since, to);
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

package springiii.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import springiii.entity.Vehicle;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class VehicleRepo {
    ObjectMapper mapper = new ObjectMapper();
    private final List<Vehicle> vehicleList = new ArrayList<>();

    public VehicleRepo() {
       try  {
           String linkFile = "src/main/resources/vehicles.json";
           List<Vehicle> vehicles = Arrays.asList(mapper.readValue(new File(linkFile), Vehicle[].class));
           vehicleList.addAll(vehicles);
       } catch (Exception ex) {
           System.out.println("Error");
       }
    }

    public List<Vehicle> getAll() {
        return vehicleList;
    }

    public Optional<Vehicle> get(String board) {
        for (Vehicle vehicle: vehicleList) {
            if (vehicle.getBoard().equalsIgnoreCase(board)) {
                return Optional.of(vehicle);
            }
        }

        return Optional.empty();
    }
}

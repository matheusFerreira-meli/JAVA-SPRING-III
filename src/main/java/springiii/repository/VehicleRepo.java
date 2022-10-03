package springiii.repository;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;
import springiii.entity.Vehicle;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class VehicleRepo {
    ObjectMapper mapper = new ObjectMapper();
    private final List<Vehicle> vehicleList = new ArrayList<>();
    private final String linkFile = "src/main/resources/vehicles.json";

    public VehicleRepo() {
       try  {
           List<Vehicle> vehicles = Arrays.asList(mapper.readValue(new File(linkFile), Vehicle[].class));
           vehicleList.addAll(vehicles);
       } catch (Exception ex) {
           System.out.println("Error");
       }
    }

    public List<Vehicle> getAll() {
        try  {
            List<Vehicle> vehicles = Arrays.asList(mapper.readValue(new File(linkFile), Vehicle[].class));
            vehicleList.addAll(vehicles);
        } catch (Exception ex) {
            System.out.println("Error");
        }
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

    public List<Vehicle> getForPrice(double since, double to) {
        return vehicleList.stream()
                .filter(vehicle -> vehicle.getPrice() >= since && vehicle.getPrice() <= to)
                .collect(Collectors.toList());
    }

    public Vehicle create(Vehicle vehicle) {
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        vehicleList.add(vehicle);

        try {
            System.out.println(vehicleList);
            writer.writeValue(new File(linkFile), vehicleList);
        } catch (Exception ex) {
            System.out.println("Error");
        }

        return vehicle;
    }
}

package springiii.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springiii.entity.Vehicle;
import springiii.interfaces.IVehicleService;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private IVehicleService service;

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{board}")
    public ResponseEntity<Vehicle> get(@PathVariable  String board) {
        return new ResponseEntity<>(service.get(board), HttpStatus.OK);
    }

    @GetMapping("/prices")
    public ResponseEntity<List<Vehicle>> getForPrice(@RequestParam  double since,  @RequestParam double to) {
        return new ResponseEntity<>(service.getForPrice(since, to), HttpStatus.OK);
    }
}

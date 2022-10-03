package springiii.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private String brand, model, currency, manufacturingDate, board;
    private int numberOfKilometers, doors, countOfOwners;
    private double price;
    private Services[] services;
}

package springiii.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import springiii.interfaces.IServices;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private String brand, model, currency;
    private Date manufacturingDate;
    private int numberOfKilometers, doors, countOfOwners;
    private double price;
    private IServices services;
}

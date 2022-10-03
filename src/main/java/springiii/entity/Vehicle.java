package springiii.entity;


import springiii.interfaces.IServices;

import java.util.Date;

public class Vehicle {
    private String brand, model, currency;
    private Date manufacturingDate;
    private int numberOfKilometers, doors, countOfOwners;
    private double price;
    private IServices services;
}

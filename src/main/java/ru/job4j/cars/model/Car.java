package ru.job4j.cars.model;

import ru.job4j.cars.model.cardetails.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "auto_brand_id")
    private AutoBrand autoBrand;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "body_type_id")
    private BodyType bodyType;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "color_id")
    private Color color;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "engine_capacity_id")
    private EngineCapacity engineCapacity;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "fuel_type_id")
    private FuelType fuelType;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "seering_wheel_id")
    private SeeringWheel seeringWheel;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "transmission_id")
    private Transmission transmission;

    public static Car of(AutoBrand autoBrand, BodyType bodyType, Color color,
                         EngineCapacity engineCapacity, FuelType fuelType,
                         SeeringWheel seeringWheel, Transmission transmission) {
        Car car = new Car();
        car.autoBrand = autoBrand;
        car.bodyType = bodyType;
        car.color = color;
        car.engineCapacity = engineCapacity;
        car.fuelType = fuelType;
        car.seeringWheel = seeringWheel;
        car.transmission = transmission;
        return car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AutoBrand getAutoBrand() {
        return autoBrand;
    }

    public void setAutoBrand(AutoBrand autoBrand) {
        this.autoBrand = autoBrand;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public EngineCapacity getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(EngineCapacity engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public SeeringWheel getSeeringWheel() {
        return seeringWheel;
    }

    public void setSeeringWheel(SeeringWheel seeringWheel) {
        this.seeringWheel = seeringWheel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return getId() == car.getId() && Objects.equals(getAutoBrand(),
                car.getAutoBrand()) && Objects.equals(getBodyType(),
                car.getBodyType()) && Objects.equals(getColor(),
                car.getColor()) && Objects.equals(getEngineCapacity(),
                car.getEngineCapacity()) && Objects.equals(getFuelType(),
                car.getFuelType()) && Objects.equals(getSeeringWheel(),
                car.getSeeringWheel()) && Objects.equals(getTransmission(),
                car.getTransmission());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAutoBrand(), getBodyType(), getColor(),
                getEngineCapacity(), getFuelType(), getSeeringWheel(), getTransmission());
    }
}

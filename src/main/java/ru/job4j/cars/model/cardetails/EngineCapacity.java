package ru.job4j.cars.model.cardetails;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "engine_capacity")
public class EngineCapacity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int volume;

    public EngineCapacity() {
    }

    public EngineCapacity(int volume) {
        this.volume = volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EngineCapacity that = (EngineCapacity) o;
        return getId() == that.getId() && getVolume() == that.getVolume();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVolume());
    }

    @Override
    public String toString() {
        return "EngineCapacity{"
                + "id=" + id
                + ", volume=" + volume
                + '}';
    }
}

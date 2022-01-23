package ru.job4j.cars.model.cardetails;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "seering_wheel")
public class SeeringWheel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    public SeeringWheel() {
    }

    public SeeringWheel(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SeeringWheel that = (SeeringWheel) o;
        return getId() == that.getId() && Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription());
    }

    @Override
    public String toString() {
        return "SeeringWheel{"
                + "id=" + id
                + ", description='" + description + '\''
                + '}';
    }
}

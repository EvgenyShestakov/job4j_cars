package ru.job4j.cars.model.cardetails;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "auto_brand")
public class AutoBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    public AutoBrand() {
    }

    public AutoBrand(String description) {
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
        AutoBrand autoBrand = (AutoBrand) o;
        return id == autoBrand.id && Objects.equals(description, autoBrand.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    @Override
    public String toString() {
        return "AutoBrand{"
                + "id=" + id
                + ", description='" + description + '\''
                + '}';
    }
}

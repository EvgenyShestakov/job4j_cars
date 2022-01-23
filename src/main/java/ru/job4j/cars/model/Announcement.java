package ru.job4j.cars.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "announcement")
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    private boolean status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    public Announcement() {
    }

    public Announcement(String description, Car car, User user) {
        this.description = description;
        this.car = car;
        this.user = user;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Announcement that = (Announcement) o;
        return getId() == that.getId() && isStatus() == that.
                isStatus() && Objects.equals(getDescription(), that.
                getDescription()) && Objects.equals(getCar(), that.
                getCar()) && Objects.equals(getUser(), that.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getCar(), isStatus(), getUser());
    }

    @Override
    public String toString() {
        return "Announcement{"
                + "id=" + id
                + ", description='" + description + '\''
                + ", car=" + car
                + ", status=" + status
                + ", user=" + user
                + '}';
    }
}

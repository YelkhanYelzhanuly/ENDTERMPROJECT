package fitness.center;

import java.util.Objects;

public class User {

    private int id;
    private String name;
    private String lastName;
    private double weight;

    public User() {}

    public User(int id, String name, String lastName, double weight) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
    }

    public User(String name, String lastName, double weight) {
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
    }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setWeight(double weight) { this.weight = weight; }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public double getWeight() { return weight; }

    @Override
    public String toString() {
        return id + " | " + name + " " + lastName + " - " + weight + " кг";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


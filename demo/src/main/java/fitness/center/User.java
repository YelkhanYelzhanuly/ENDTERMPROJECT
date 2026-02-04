package fitness.center;

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
}

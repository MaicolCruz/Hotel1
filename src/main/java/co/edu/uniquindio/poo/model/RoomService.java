package co.edu.uniquindio.poo.model;

public class RoomService {

    private int id;
    private String name;
    private String description;
    private double price;

    // Constructor
    public RoomService(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}

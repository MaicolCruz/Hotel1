package co.edu.uniquindio.poo.model;

public class Service {

    private int id;
    private String name;
    private double price;

    // Constructor
    public Service(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
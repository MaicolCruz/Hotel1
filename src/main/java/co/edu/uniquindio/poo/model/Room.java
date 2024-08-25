package co.edu.uniquindio.poo.model;

public class Room {
    private int number;
    private String type;
    private double pricePerNight;
    private boolean isAvailable;

    // Constructor
    public Room(int number, String type, double pricePerNight) {
        this.number = number;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true; // Por defecto, la habitación está disponible
    }

    // Getters y setters
    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}
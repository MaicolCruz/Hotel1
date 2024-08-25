package co.edu.uniquindio.poo.model;
import java.util.Date;
import java.util.List;

public class Booking {
    private Customer customer;
    private Room room;
    private Date checkIn;
    private Date checkOut;


    public Booking(Customer customer, Room room, Date checkIn, Date checkOut) {
        this.customer = customer;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        // Actualizar el estado de la habitación a no disponible
        room.setAvailable(false);
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    private List<Service> additionalServices = new ArrayList<>();

    // Método para agregar un servicio adicional a la reserva
    public void addAdditionalService(Service service) {
        additionalServices.add(service);
        // Actualizar el precio total de la reserva
    }

    // Método para obtener la lista de servicios adicionales
    public List<Service> getAdditionalServices() {
        return additionalServices;
    }

}

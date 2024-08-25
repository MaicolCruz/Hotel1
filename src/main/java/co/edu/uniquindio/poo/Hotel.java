package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public static void main(String[] args) {
        private static List<Room> rooms = new ArrayList<>();
        private static List<Customer> customers = new ArrayList<>();
        private static List<Booking> bookings = new ArrayList<>();

            initialize();

            private static void initialize() {
                // Código para inicializar el hotwl
                Room room1 = new Room(101, "Deluxe", 150.0);
                Room room2 = new Room(202, "Standard", 100.0);
                rooms.add(room1);
                rooms.add(room2);

                Customer customer1 = new Customer(1, "Juan", "Pérez", "juan@example.com", "123456789");
                Customer customer2 = new Customer(2, "María", "González", "maria@example.com", "987654321");
                customers.add(customer1);
                customers.add(customer2);

                // Crear reservas de muestra
                Booking booking1 = new Booking(customer1, room1, new Date(2023, 11, 25), new Date(2023, 11, 30));
                bookings.add(booking1);

                // Crear una habitación
                Room room1 = new Room(101, "Deluxe", 150.0);
                Hotel.addRoom(room1);

                // Crear un cliente
                Customer customer3 = new Customer(3, "Juan", "Lopez", "juan@example.com", "000000022222");
                Hotel.addCustomer(customer3);

                // Realizar una reserva
                Date checkIn = new Date(2023, 11, 25);
                Date checkOut = new Date(2023, 11, 30);
                Hotel.makeBooking(customer3, room1, checkIn, checkOut);

                // Servicios pues a la habitacion jeje
                Service breakfast = new Service(1, "Desayuno", 10.0);
                room1.addAdditionalService(breakfast);

                Booking booking1 = new Booking(customer1, room1, checkIn, checkOut);
                booking1.addAdditionalService(breakfast);

                double totalPrice = booking1.getTotalPrice();
                System.out.println("El precio total de la reserva es: " + totalPrice);

                // Servicios a la habitacion adicionales
                RoomService roomService1 = new RoomService(1, "Servicio a la habitación", "Cena ligera", 15.0);
                booking1.addRoomService(roomService1);

                double totalPrice = booking1.getTotalPrice();
                System.out.println("El precio total de la reserva es: " + totalPrice);
                }
        }
    }


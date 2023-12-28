import Model.*;
import Repository.DB_Manager;

import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args) {
        DB_Manager db = new DB_Manager();

        Hotel hotel1 = new Hotel();
        hotel1.setHotelName("My hotel1");
        hotel1.setLocation("tehran");
        hotel1.setRating("10/10");
        hotel1.setYearsOfWork("10 years");

        //saving rooms
        Room room1 = new Room();
        room1.setLabel("A1");
        room1.setRoomType(RoomType.STANDARD);
        room1.setHotel(hotel1);

        Room room2 = new Room();
        room2.setLabel("A2");
        room2.setRoomType(RoomType.DELUXE);
        room2.setHotel(hotel1);

        Room room3 = new Room();
        room3.setLabel("B1");
        room3.setRoomType(RoomType.STANDARD);
        room3.setHotel(hotel1);

        Guest guest1 = new Guest();
        guest1.setFullName("ali ahmadi");
        guest1.setEmail("example@gmail.com");
        guest1.setMobileNumber("09027788994");

        Guest guest2 = new Guest();
        guest2.setFullName("akbar abdi");
        guest2.setEmail("example@gmail.com");
        guest2.setMobileNumber("09027788994");

        Guest guest3 = new Guest();
        guest3.setFullName("amin kahram");
        guest3.setEmail("example@gmail.com");
        guest3.setMobileNumber("09027788994");

        Booking booking1 = new Booking();
        booking1.setGuest(guest1);
        booking1.setRoom(room3);
        LocalDate now = LocalDate.now();
        booking1.setCheckInDate(now);
        booking1.setCheckOutDate(now.plusDays(3));

        db.save(hotel1);

        db.save(room1);
        db.save(room2);
        db.save(room3);

        db.save(guest1);
        db.save(guest2);
        db.save(guest3);

        db.save(booking1);
    }
}
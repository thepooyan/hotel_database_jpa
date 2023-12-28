import Model.Booking;
import Model.Guest;
import Model.Room;
import Repository.DB_Manager;

public class MainClass {
    public static void main(String[] args) {
        DB_Manager db = new DB_Manager();

        //saving rooms
        Room room1 = new Room();
        room1.setLabel("A1");

        Room room2 = new Room();
        room2.setLabel("A2");

        Room room3 = new Room();
        room3.setLabel("B1");

        Guest guest1 = new Guest();
        guest1.setFullName("ali ahmadi");

        Guest guest2 = new Guest();
        guest2.setFullName("akbar abdi");

        Guest guest3 = new Guest();
        guest3.setFullName("amin kahram");

        Booking booking1 = new Booking();
        booking1.setGuest(guest1);
        booking1.setRoom(room3);


        db.save(room1);
        db.save(room2);
        db.save(room3);


        db.save(guest1);
        db.save(guest2);
        db.save(guest3);

        db.save(booking1);
    }
}

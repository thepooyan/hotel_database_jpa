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


        db.save(room1);
        db.save(room2);
        db.save(room3);
    }
}

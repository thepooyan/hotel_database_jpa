import Model.Room;
import dao.CrudDao;
import dao.CrudDaoImpl;

public class MainClass {
    public static void main(String[] args) {
        CrudDao cd = new CrudDaoImpl<Room, Integer>();

        //saving rooms
        Room room1 = new Room();
        room1.setLabel("A1");

        Room room2 = new Room();
        room2.setLabel("A2");

        Room room3 = new Room();
        room3.setLabel("B1");


        cd.save(room1);
        cd.save(room2);
        cd.save(room3);
    }
}

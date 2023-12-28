package Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
@SecondaryTable(name = "Hotel_Info")
public class Hotel implements Model {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String hotelName;

        @Column(table = "Hotel_Info")
        private String location;
        @Column(table = "Hotel_Info")
        private String rating;
        @Column(table = "Hotel_Info")
        private String yearsOfWork;


        @OneToMany(mappedBy = "hotel")
        List<Room> rooms = new ArrayList<>();
}

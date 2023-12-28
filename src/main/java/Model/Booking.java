package Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
public class Booking {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @ManyToOne
        @JoinColumn(name = "room_id")
        private Room room;

        @ManyToOne
        @JoinColumn(name = "guest_id")
        private Guest guest;
}

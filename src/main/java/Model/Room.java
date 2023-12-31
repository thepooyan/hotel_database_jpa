package Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
public class Room implements Model {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String label;
        private RoomType roomType;

        @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
        private List<Booking> bookings = new ArrayList<>();

        @ManyToOne
        @JoinColumn(name = "hotel_id")
        private Hotel hotel;
}

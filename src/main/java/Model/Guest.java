package Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
public class Guest implements Model {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String fullName;
        private String email;
        @Column(length = 20)
        private String mobileNumber;

        @OneToMany(mappedBy = "guest")
        private List<Booking> bookings = new ArrayList();
}

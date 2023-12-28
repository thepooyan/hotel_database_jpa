package Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.AuditMappedBy;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
public class Guest {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String fullName;

        @OneToMany
        private List<Booking> bookings = new ArrayList();
}

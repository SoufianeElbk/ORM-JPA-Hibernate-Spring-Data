package ma.enset.ap2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class Patient {
    @Setter @Getter
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter @Getter
    private String name;
    @Setter @Getter
    private Date dateOfBirth;
    @Setter @Getter
    private boolean sickness;
    @Setter @Getter
    private int score;
}
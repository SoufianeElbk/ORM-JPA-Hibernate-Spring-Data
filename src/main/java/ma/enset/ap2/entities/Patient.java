package ma.enset.ap2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date dateOfBirth;
    private boolean sickness;
    private int score;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
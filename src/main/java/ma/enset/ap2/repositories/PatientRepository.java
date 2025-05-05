package ma.enset.ap2.repositories;

import ma.enset.ap2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    List<Patient> findBySickness(boolean sickness);
}
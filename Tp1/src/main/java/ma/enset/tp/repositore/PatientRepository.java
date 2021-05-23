package ma.enset.tp.repositore;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import ma.enset.tp.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

	public Page<Patient> findByNomContains(String mc,Pageable pageable);
}

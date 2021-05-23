package ma.enset.tp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import ma.enset.tp.entities.Patient;
import ma.enset.tp.repositore.PatientRepository;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*patientRepository.save(new Patient(null,"amine",new Date(),2300,false));
		patientRepository.save(new Patient(null,"assia",new Date(),2300,false));
		patientRepository.save(new Patient(null,"mohamed",new Date(),2300,false));*/
		patientRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});

	}

}

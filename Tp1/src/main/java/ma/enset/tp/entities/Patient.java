package ma.enset.tp.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table (name="PATIENTS")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Patient {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min=5,max=15,message="nom incorrect")
 	private String nom;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern  = "yyyy-MM-dd")
	private Date datedenaissance;
	@DecimalMin("4")
	private int score;
	private boolean malade;

}

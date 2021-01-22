package tn.iit.medicalfile.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
public class DossierMedical implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @CreatedDate
    private Date createdDate;
    @OneToOne
    private Patient patient;

    
    public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public DossierMedical(Patient patient){
        this.patient=patient;
    }
	

	public DossierMedical() {
		super();
	}


	public DossierMedical(long id, Date createdDate, Patient patient) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.patient = patient;
	}
    
}

package tn.iit.medicalfile.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
public class Traitement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private DossierMedical dossier;
    private long medicamentId;

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DossierMedical getDossier() {
		return dossier;
	}

	public void setDossier(DossierMedical dossier) {
		this.dossier = dossier;
	}

	public long getMedicamentId() {
		return medicamentId;
	}

	public void setMedicamentId(long medicamentId) {
		this.medicamentId = medicamentId;
	}

	public Traitement() {
		super();
	}

	public Traitement(DossierMedical dossier, long medicamentId) {
        this.dossier = dossier;
        this.medicamentId = medicamentId;
    }
}

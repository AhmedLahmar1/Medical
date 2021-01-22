package tn.iit.medicalfile.dto;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)

public class TraitementDto {

    private long id;
    private long dossierId;
    private String medicamentName;
    private float medicamentDosage;
    private float medicamentPrice;
    private long medicamentId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDossierId() {
		return dossierId;
	}
	public void setDossierId(long dossierId) {
		this.dossierId = dossierId;
	}
	public String getMedicamentName() {
		return medicamentName;
	}
	public void setMedicamentName(String medicamentName) {
		this.medicamentName = medicamentName;
	}
	public float getMedicamentDosage() {
		return medicamentDosage;
	}
	public void setMedicamentDosage(float medicamentDosage) {
		this.medicamentDosage = medicamentDosage;
	}
	public float getMedicamentPrice() {
		return medicamentPrice;
	}
	public void setMedicamentPrice(float medicamentPrice) {
		this.medicamentPrice = medicamentPrice;
	}
	public long getMedicamentId() {
		return medicamentId;
	}
	public void setMedicamentId(long medicamentId) {
		this.medicamentId = medicamentId;
	}
	public TraitementDto() {
		super();
	}
    
    
}

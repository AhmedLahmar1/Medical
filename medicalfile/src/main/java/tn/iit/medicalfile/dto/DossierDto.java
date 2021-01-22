package tn.iit.medicalfile.dto;

import com.fasterxml.jackson.annotation.JsonInclude;



import java.util.Collection;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class DossierDto {
    private long id;
    private long patientId;
    private String patientName;
    private Collection<TraitementDto> traitements;
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Collection<TraitementDto> getTraitements() {
		return traitements;
	}

	public void setTraitements(Collection<TraitementDto> traitements) {
		this.traitements = traitements;
	}

	public DossierDto(long id, long patientId, String patientName, Collection<TraitementDto> traitements) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.patientName = patientName;
		this.traitements = traitements;
	}

	public DossierDto() {
		super();
	}

	public DossierDto(Long id){
        this.id=id;
    }
    
}

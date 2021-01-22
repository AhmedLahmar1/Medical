package tn.iit.medicalfile.dto;


public class MedicamentDto {
    private long id;
    private String name;
    private float dosage;
    private float price;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDosage() {
		return dosage;
	}
	public void setDosage(float dosage) {
		this.dosage = dosage;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public MedicamentDto() {
		super();
	}
	public MedicamentDto(long id, String name, float dosage, float price) {
		super();
		this.id = id;
		this.name = name;
		this.dosage = dosage;
		this.price = price;
	}
    
	
}


package tn.iit.storemanagement.dto;




import java.util.Date;


public class MedicamentDto {
    private long id;
    private String name;
    private float dosage;
    private float price;
    private Date expiredDate;
    private long categoryId;
    private String categoryName;
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
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
	public MedicamentDto() {
		super();
	}
	public MedicamentDto(long id, String name, float dosage, float price, Date expiredDate, long categoryId,
			String categoryName) {
		super();
		this.id = id;
		this.name = name;
		this.dosage = dosage;
		this.price = price;
		this.expiredDate = expiredDate;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
    
    
    
}

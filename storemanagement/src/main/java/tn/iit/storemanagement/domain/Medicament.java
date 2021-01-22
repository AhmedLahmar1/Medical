package tn.iit.storemanagement.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Medicament implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private float dosage;

    private float price;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date expiredDate;
    @ManyToOne
    private Category category;

    
    
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



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}


	public Medicament() {
		super();
	}

	public Medicament(String name, float dosage, float price, Date expiredDate, Category category) {
        this.name = name;
        this.dosage = dosage;
        this.price = price;
        this.expiredDate = expiredDate;
        this.category = category;
    }
}

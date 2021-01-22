package tn.iit.medicalfile.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
public class Patient implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long cin;
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date birthday;



    public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public long getCin() {
		return cin;
	}



	public void setCin(long cin) {
		this.cin = cin;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public Patient() {
		super();
	}



	public Patient(String name,long cin,Date birthday){
        this.name=name;
        this.cin=cin;
        this.birthday=birthday;
    }
}

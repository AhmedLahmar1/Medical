package tn.iit.medicalfile.dto;

import java.util.Date;


public class PatientDto {
    private long id;
    private long cin;
    private String name;
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



	public PatientDto(long id)
    {
        this.id=id;
    }



	public PatientDto() {
		super();
	}

	
}

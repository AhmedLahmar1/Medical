package tn.iit.storemanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
public class Category implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    
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


	public Category(String name){
        this.name=name;
    }
	

	public Category() {
		super();
	}


	public Category(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

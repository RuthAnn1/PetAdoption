package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "pets")
@Table(name = "pets")
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;
	private String petType;
	private String petBreed;
	private int petAge;
	

	public int getRowId() {
		return rowId;
	}


	public void setRowId(int rowId) {
		this.rowId = rowId;
	}


	public String getPetType() {
		return petType;
	}


	public void setPetType(String petType) {
		this.petType = petType;
	}


	public String getPetBreed() {
		return petBreed;
	}


	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}


	public int getPetAge() {
		return petAge;
	}


	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}


	public Pet() {
		// TODO Auto-generated constructor stub
	}

}

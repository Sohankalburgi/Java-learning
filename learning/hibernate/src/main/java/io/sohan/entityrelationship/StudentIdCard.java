package io.sohan.entityrelationship;

import javax.persistence.*;
@Entity
public class StudentIdCard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cardNumber;
	
	private String firwareVersion;

	@OneToOne(mappedBy = "card")
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getFirwareVersion() {
		return firwareVersion;
	}

	public void setFirwareVersion(String firwareVersion) {
		this.firwareVersion = firwareVersion;
	}
	
}

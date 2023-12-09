package io.sohan.entityrelationship;

import java.util.List;

import javax.persistence.*;
@Entity
public class Student {
	
	@Column (name="StudentName", nullable=false)
	private String name;
	@Id
	private int rollNO;
	
	// The OneToOne is having Eager type in default which means it gives
	// all the Query related to it
	// If it is lazy type then it is fetch only at get the object using find
	@OneToOne (fetch = FetchType.LAZY)
	private StudentIdCard card;
	
	
	@OneToMany(mappedBy = "student")
	private List<Course> courseList;
	
	
	
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public StudentIdCard getcard() {
		return card;
	}
	public void setcard(StudentIdCard card) {
		this.card = card;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public String toString()
	{
		return this.name+" "+this.card.getCardNumber()+" "+this.card.getFirwareVersion();
	}
}

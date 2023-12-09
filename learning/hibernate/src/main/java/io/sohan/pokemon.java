package io.sohan;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // the entity annotation is to make the class as entity
@Table (name="newPokemonTable")
public class pokemon {

	
	@Id
	@Column (name="pokemon_name")
	private String name;
	
	@Column (nullable = false) // to make the column not to store null
	private String type;
	@Column
	private String power;
	@Column
	private int level;
	//@Column
//	private String color;
//	
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
	@Enumerated (EnumType.STRING)
	Color color; // Enumtype
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String toString()
	{
		return this.getName()+" "+this.getType()+" "+this.getPower();
	}
	
}

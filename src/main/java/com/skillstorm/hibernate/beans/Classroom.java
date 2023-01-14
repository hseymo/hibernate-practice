package com.skillstorm.hibernate.beans;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLASSROOM")
public class Classroom {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CLASSROOM_ID")
	private int id;
	
	@Column(name="CLASSROOM_NAME")
	private String name;
	
	@OneToMany(mappedBy="classroom")
	private Set<Trainee> trainees;

	public Classroom() {
		super();
	}

	public Classroom(String name) {
		super();
		this.name = name;
	}

	public Classroom(String name, Set<Trainee> trainees) {
		super();
		this.name = name;
		this.trainees = trainees;
	}

	public Classroom(int i) {
		this.id = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}

	@Override
	public String toString() {
		return "Classroom [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, trainees);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classroom other = (Classroom) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(trainees, other.trainees);
	}
	
	
	
}

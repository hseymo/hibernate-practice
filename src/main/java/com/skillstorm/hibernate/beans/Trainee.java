package com.skillstorm.hibernate.beans;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="TRAINEE")
public class Trainee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TRAINEE_ID")
	private int id;
	
	@Column(name="TRAINEE_NAME")
	private String name;
	
	@Column(name="TRAINEE_MAJOR")
	private String major;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TRAINEE_CLASSROOM")
	private Classroom classroom;
	public Trainee() {
		super();
	}
	public Trainee(String name, String major, Classroom classroom) {
		super();
		this.name = name;
		this.major = major;
		this.classroom = classroom;
	}
	public Trainee(String name, String major) {
		super();
		this.name = name;
		this.major = major;
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", major=" + major + ", classroom=" + classroom + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(classroom, id, major, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		return Objects.equals(classroom, other.classroom) && id == other.id && Objects.equals(major, other.major)
				&& Objects.equals(name, other.name);
	}
	
	

}

package com.etz.courseapi.courseModel;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class CourseModel {
	
	@Id
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String name;
	private String description;
	
public CourseModel() {
	
}
}

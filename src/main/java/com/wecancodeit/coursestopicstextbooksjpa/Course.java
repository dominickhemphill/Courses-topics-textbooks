package com.wecancodeit.coursestopicstextbooksjpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String description;
	
	@ManyToMany(mappedBy = "courses")
	 private Collection<Topic> topics;
	
	
	public Course() {}
	
	
	public Course(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Collection<Topic> getTopics() {
		return topics;
	}
	
}



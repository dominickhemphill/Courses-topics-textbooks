package com.wecancodeit.coursestopicstextbooksjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CoursePopulator implements CommandLineRunner{
	
	@Autowired
	CourseRepository courseRepo;
	@Autowired
	TopicRepository topicRepo;
	@Autowired
	TextbookRepository textRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public CoursePopulator() 
	{
		Course headFirstJava = new Course();
		Course headFirstDesignPatterns = new Course();
		Course cleanCode = new Course();
		Course introToJpa = new Course();
		
	}



}

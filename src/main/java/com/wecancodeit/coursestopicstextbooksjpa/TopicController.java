package com.wecancodeit.coursestopicstextbooksjpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopicController
{

	
	
		@Autowired
		TopicRepository topicRepo;
		@Autowired
		TextbookRepository textRepo;
		@Autowired
		CourseRepository courseRepo;
		
		@RequestMapping("/")
		public String getTopics(Model model) {
			model.addAttribute("topics", topicRepo.findAll());
			return "topics";
		}
	}
	



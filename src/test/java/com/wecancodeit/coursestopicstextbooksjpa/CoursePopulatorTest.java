package com.wecancodeit.coursestopicstextbooksjpa;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class CoursePopulatorTest {
	
	@Autowired
	TopicRepository repo;
	
	@Test
	public void populatorShouldSaveAndLoadTopic() {
		Topic testTopic = repo.save(new Topic("test"));
		Topic underTest = repo.findOne(1L);
		assertThat(underTest, is(equalTo(testTopic)));
		
	}
	
	

}

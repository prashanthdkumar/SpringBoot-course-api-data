package org.prashanth.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	//public List<Course> findByName(String name);
	//public List<Course> findByDescription(String foo);
	public List<Course> findByTopicId(String TopicId);	
}

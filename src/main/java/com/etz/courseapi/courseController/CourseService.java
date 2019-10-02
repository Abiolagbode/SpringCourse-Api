package com.etz.courseapi.courseController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etz.courseapi.courseModel.CourseModel;
import com.etz.courseapi.courseRepository.CourseRepo;

@Service
public class CourseService {

	@Autowired
	private CourseRepo courseRepo;
	
	public List<CourseModel> getAllCourses() {
		List<CourseModel> coursesCourseModels = new ArrayList<>();
		courseRepo.findAll()
		.forEach(coursesCourseModels::add);
		return coursesCourseModels;
	}
	

}

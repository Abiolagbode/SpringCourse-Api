package com.etz.courseapi.courseController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etz.courseapi.courseModel.CourseModel;

@RestController
public class CourseController {
	
	private CourseService courseService;

	@RequestMapping("/courses")
	public List<CourseModel> getAllCourses(){
		return courseService.getAllCourses();
	}
	
}

package com.etz.courseapi.courseRepository;

import org.springframework.data.repository.CrudRepository;

import com.etz.courseapi.courseModel.CourseModel;

public interface CourseRepo extends CrudRepository<CourseModel, String> {

}

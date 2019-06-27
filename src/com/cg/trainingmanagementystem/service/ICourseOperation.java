package com.cg.trainingmanagementystem.service;

import java.util.*;

import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.exception.InvalidCourseNameException;
import com.cg.trainingmanagementystem.service.bin.Course;


public interface ICourseOperation {

	
	public Set<Course> getAllCourse();
	
	
boolean deleteCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws InvalidCourseIdException, InvalidCourseNameException;
	boolean  addCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws InvalidCourseIdException, InvalidCourseNameException, CourseNullException;
	boolean modifyCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws InvalidCourseIdException, InvalidCourseNameException;


	//public void deleteCourse(String courseId);


}
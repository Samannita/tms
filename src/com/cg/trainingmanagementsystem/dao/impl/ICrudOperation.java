package com.cg.trainingmanagementsystem.dao.impl;
import java.util.*;

import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.service.bin.Course;

/**
 * 
 */
public interface ICrudOperation<T> {

	/**
	 * @throws CourseNullException 
	 * 
	 */
	public boolean create(Course course) throws CourseNullException;

	/**
	 * @throws InvalidCourseIdException 
	 * 
	 */
	public boolean update(Course course) throws InvalidCourseIdException;

	/**
	 * 
	 */
	public T retrieve(T o);

	/**
	 * @throws InvalidCourseIdException 
	 * 
	 */
	public boolean delete(Course course) throws InvalidCourseIdException;

	/**
	 * 
	 */
	public HashSet<T> retrieveAll();
	public void addCourses(Set<Course> course);

}
package com.cg.trainingmanagementsystem.dao.impl;
import java.util.*;

import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.exception.InvalidCourseNameException;
import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.bin.Course;
import com.cg.trainingmanagementystem.utility.UserInputValidator;
public  class CourseOperationDaoImpl  implements ICourseOperation  {
	
	

	public boolean create(Course course) throws CourseNullException, InvalidCourseIdException {
		boolean result=false;
		if(course==null) {
			throw new CourseNullException();
		}
		String value = course.getCourseId();
		if(UserInputValidator.courseIdValidLength(value) != null){
			throw new InvalidCourseIdException("Invalid");
		}
//		String detail = course.getCourseId();
		DataBaseEntry.course.add(course);
		
		result=true;
		return false;
	}

	public String update(Course course) throws InvalidCourseIdException {
		String value = course.getCourseId();
		if(UserInputValidator.courseIdValidLength(value) != null){
			throw new InvalidCourseIdException("Invalid");
		}
		
		((CourseOperationDaoImpl) DataBaseEntry.course).update(course);
		return value;
	}


	public static String delete(Course course) throws InvalidCourseIdException {
		
		String deletedCourseId= course.getCourseId();
		if(UserInputValidator.courseIdValidLength(deletedCourseId) != null){
			throw new InvalidCourseIdException("Invalid");
		}
		if(course.getCourseId().contentEquals(deletedCourseId))
		DataBaseEntry.course.remove(course);
		
		return deletedCourseId;
		
		
	}
	
	public HashSet<Course> retrieveAll(Course course) {
		Set<Course> co = DataBaseEntry.course;
		Set<Course> cor = new HashSet<>();
		  Iterator itr = co.iterator();
	        while(itr.hasNext())
	        {
	            System.out.println(itr.next());
	        }
	        retrieveAll(course);
		
		return null;
	}

	@Override
	public Set<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws InvalidCourseIdException, InvalidCourseNameException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws InvalidCourseIdException, InvalidCourseNameException, CourseNullException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws InvalidCourseIdException, InvalidCourseNameException {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public void deleteCourse(String courseId) {
//		// TODO Auto-generated method stub
//		
//	}

}
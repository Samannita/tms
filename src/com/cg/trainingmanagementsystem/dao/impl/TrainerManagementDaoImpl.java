package com.cg.trainingmanagementsystem.dao.impl;

import java.util.*;

import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.service.bin.Course;
import com.cg.trainingmanagementystem.service.bin.Trainer;

/**
 * 
 */
public class TrainerManagementDaoImpl implements ICrudOperation<Trainer> {

	public boolean create(Trainer o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Trainer o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Trainer retrieve(Trainer o) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(Trainer o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HashSet<Trainer> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Course course) throws CourseNullException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Course course) throws InvalidCourseIdException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addCourses(Set<Course> course) {
		// TODO Auto-generated method stub
		
	}

}
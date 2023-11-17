package com.springapp.springbootsecuritywithjwt.service;

import com.springapp.springbootsecuritywithjwt.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    Optional<List<Course>> findAll();

    Optional<List<Course>> findByTitleContaining(String title);

    Optional<Course> findById(long id);

    Optional<Course> createCourse(Course course);

    void deleteAllCourses();

    void deleteCourseById(long id);

}

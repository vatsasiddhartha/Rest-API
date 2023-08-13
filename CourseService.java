package com.FirstRestApi.FirstRestApi.services;

import com.FirstRestApi.FirstRestApi.entities.courses;

import java.util.List;

public interface CourseService {
    public List<courses>getCourses();
    public courses getCourse(long  courseId);
    public courses addcourses(courses  newcourse);

  public  courses updateCourse(courses addedCourse);

    public default void deleteCourse(long parseLong) {

    }
}

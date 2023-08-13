package com.FirstRestApi.FirstRestApi.courseDao;

import com.FirstRestApi.FirstRestApi.entities.courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<courses,Long> {
}

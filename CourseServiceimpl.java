package com.FirstRestApi.FirstRestApi.services;

import com.FirstRestApi.FirstRestApi.courseDao.CourseDao;
import com.FirstRestApi.FirstRestApi.entities.courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class CourseServiceimpl implements CourseService {
    @Autowired

    private CourseDao Daocourse;
//    List<courses> list;
    public CourseServiceimpl(){
//        list=new ArrayList<>();
//        list.add(new courses(56,"java","this course is for java"));
//        list.add(new courses(45,"SPRING BOOT","this course is for SPRING BOOT"));
//        list.add(new courses(100,"SPRING ","this course is for SPRING "));

    }
    @Override
    public List<courses> getCourses() {

        return Daocourse.findAll();
    }

    @Override
    public courses getCourse(long courseId) {
//         courses c= null;
//        for(courses course:list){
//            if (course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }
        return Daocourse.getOne(courseId);
    }

    @Override
    public courses addcourses(courses newcourse) {
//        list.add(newcourse);
        Daocourse.save(newcourse);
      return newcourse;
 }

    @Override
    public courses updateCourse(courses addedCourse) {

//        for (courses e : list) {
//            if (e.getId() == addedCourse.getId()) {
//                e.setTitle(addedCourse.getTitle());
//                e.setDescription(addedCourse.getDescription());
//            }
//        }
        Daocourse.save(addedCourse);
        return addedCourse;
    }

    @Override
    public void deleteCourse(long parseLong) {
//        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        courses entity =Daocourse.getOne(parseLong);
        Daocourse.delete(entity);

    }

}

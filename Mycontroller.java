package com.FirstRestApi.FirstRestApi.Mycotnrol;

import com.FirstRestApi.FirstRestApi.entities.courses;
import com.FirstRestApi.FirstRestApi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController




public class Mycontroller {
//    @RequestMapping ("/")
//    public String home(){
//        return "index";
//    }
    @Autowired
    private CourseService courseSerivice;






    //gET THE COURSE
    @GetMapping("/courses")
    public List<courses>getCourses(){
        return this.courseSerivice.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public courses getCourse(@PathVariable String  courseId){
        return this.courseSerivice.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public courses addcourses(@RequestBody courses newcourse){

        return this.courseSerivice.addcourses(newcourse);
    }
    @PutMapping("/courses")
    public courses updatecourses(@RequestBody courses addedCourse){
        return  this.courseSerivice.updateCourse(addedCourse);
    }
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String courseId){
        try{
            this.courseSerivice.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

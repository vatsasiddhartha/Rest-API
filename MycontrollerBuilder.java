package com.FirstRestApi.FirstRestApi.Mycotnrol;

import com.FirstRestApi.FirstRestApi.services.CourseService;

public class MycontrollerBuilder {
    private CourseService courseService;

    public MycontrollerBuilder setCourseService(CourseService courseService) {
        this.courseService = courseService;
        return this;
    }

    public Mycontroller createMycontroller() {
        return new Mycontroller();
    }
}
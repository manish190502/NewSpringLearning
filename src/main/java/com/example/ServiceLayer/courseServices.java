package com.example.ServiceLayer;

import java.util.List;

import com.example.entities.courses;

public interface courseServices {
    
    public List<courses> getCourses();

    public courses getSingleCourses(Long courseId);

    public courses addCourses(courses course);

}

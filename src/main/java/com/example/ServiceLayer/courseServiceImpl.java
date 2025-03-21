package com.example.ServiceLayer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.courses;

@Service
public class courseServiceImpl implements courseServices {

    List<courses> list;

    public courseServiceImpl(){
        list = new ArrayList<>();
        list.add(new courses(1,"Java..."));
        list.add(new courses(2,"Python..."));
    }
    

    @Override
    public List<courses> getCourses(){
        return list;
    }


    @Override
    public courses getSingleCourses(Long courseId) {

        for (courses c : list){
            if (c.getCourseId() == courseId) {
                return c;
            }
        }
        return null;
        
    }


    @Override
    public courses addCourses(courses course) {
        list.add(course);
        return course;
    }
    
}

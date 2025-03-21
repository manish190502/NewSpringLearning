package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServiceLayer.courseServices;
import com.example.entities.courses;

@RestController
@RequestMapping("/api")
public class myController {

    @Autowired
    public courseServices cServices;

    @GetMapping("/home")
    public String sayHello(){
        return "hello spring!";
    }

    @GetMapping("/courses")
    public List<courses> getCourses(){
        return this.cServices.getCourses();
    }
    
    @GetMapping("/courses/single")
    public courses getSingleCourses(@RequestParam("id") String id){
        return this.cServices.getSingleCourses(Long.parseLong(id));
    }

    @PostMapping("/courses")
    public courses addCourses(@RequestBody courses course){
        return this.cServices.addCourses(course);
    }
}

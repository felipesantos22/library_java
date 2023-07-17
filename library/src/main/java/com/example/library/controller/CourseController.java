package com.example.library.controller;

import com.example.library.dto.CourseDto;
import com.example.library.entity.Course;
import com.example.library.service.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
    private CourseService courseService;
    private ModelMapper modelMapper;
    @PostMapping
    public CourseDto createCourseController(@RequestBody Course course) {
        Course courses = courseService.createCourseService(course);
        return modelMapper.map(courses, CourseDto.class);
    }
}

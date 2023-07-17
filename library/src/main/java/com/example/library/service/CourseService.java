package com.example.library.service;
import com.example.library.entity.Course;
import com.example.library.repository.CourseRepository;
import org.springframework.stereotype.Service;
@Service
public class CourseService {
    private CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public Course createCourseService(Course course){
        return courseRepository.save(course);
    }

}

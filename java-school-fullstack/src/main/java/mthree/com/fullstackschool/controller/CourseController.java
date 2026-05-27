package mthree.com.fullstackschool.controller;

import java.util.ArrayList;
import mthree.com.fullstackschool.model.Course;
import mthree.com.fullstackschool.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/course")
@CrossOrigin
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        //YOUR CODE STARTS HERE
        
        List<Course> courses = courseService.getAllCourses();
        return courses;
        
        //YOUR CODE ENDS HERE
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable int id) {
        //YOUR CODE STARTS HERE
        
        Course courseResult = courseService.getCourseById(id);
        return courseResult;
        
        //YOUR CODE ENDS HERE
    }

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        //YOUR CODE STARTS HERE
        
        Course courseResult = courseService.addNewCourse(course);
        return courseResult;

        //YOUR CODE ENDS HERE
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable int id, @RequestBody Course course) {
        //YOUR CODE STARTS HERE
        
        Course courseResult = courseService.updateCourseData(id, course);
        return courseResult;

        //YOUR CODE ENDS HERE
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id) {
        //YOUR CODE STARTS HERE
        
        courseService.deleteCourseById(id);

        //YOUR CODE ENDS HERE
    }
}

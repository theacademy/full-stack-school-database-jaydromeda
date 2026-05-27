package mthree.com.fullstackschool.controller;

import mthree.com.fullstackschool.model.Teacher;
import mthree.com.fullstackschool.service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class TeacherController {

    @Autowired
    TeacherServiceImpl teacherServiceImpl;

    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers() {
        //YOUR CODE STARTS HERE
        

        List<Teacher> teachers = teacherServiceImpl.getAllTeachers();
        return teachers;

        //YOUR CODE ENDS HERE
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable int id) {
        //YOUR CODE STARTS HERE
        

        Teacher teacherResult = teacherServiceImpl.getTeacherById(id);
        return teacherResult;

        //YOUR CODE ENDS HERE
    }

    @PostMapping("/add")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        //YOUR CODE STARTS HERE
        

        Teacher teacherResult = teacherServiceImpl.addNewTeacher(teacher);
        return teacherResult;

        //YOUR CODE ENDS HERE
    }

    @PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable int id, @RequestBody Teacher teacher) {
        //YOUR CODE STARTS HERE

        Teacher teacherResult = teacherServiceImpl.updateTeacherData(id, teacher);
        return teacherResult;

        //YOUR CODE ENDS HERE
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable int id) {
        //YOUR CODE STARTS HERE

        teacherServiceImpl.deleteTeacherById(id);
        
        //YOUR CODE ENDS HERE
    }
}

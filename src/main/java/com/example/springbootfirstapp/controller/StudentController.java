package com.example.springbootfirstapp.controller;

// Naming convention resource + controller

import com.example.springbootfirstapp.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent() {
         return new Student("Ilan", "Groovy");
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ilan", "Groovy"));
        students.add(new Student("Dan", "Maven"));
        students.add(new Student("Tom", "Maven"));
        students.add(new Student("Charles", "Maven"));
        students.add(new Student("Nandor", "Maven"));

        return students;
    }

    // @PathVariable to bind
    @GetMapping("/student/{first}/{last}")
    public Student getStudentByPathVariable(@PathVariable(name = "first") String first,
                                            @PathVariable(name = "last") String last) {
        return new Student(first, last);
    }

    // build REST api to handle query parameters
    // http://localhost:8080/student?firstName=ilan&lastName=cool     query parameter key:value pair
    @GetMapping("/student/query")
    public Student getStudentWithQueryParam(@RequestParam(name = "first") String first,
                                            @RequestParam(name = "last") String last) {
        return new Student(first, last);
    }

}

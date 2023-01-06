package com.spring.lombok.controller;

import com.spring.lombok.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/all")
    public List<Student> getStudents(){
        return create();
    }

    private List<Student> create(){
        List<Student> students = new ArrayList<>();
        Student student1 =
                Student.builder().id(1L).name("Osama").address("Cairo").age("30").build();
        /*student1.setId(1L);student1.setName("Eslam");
        student1.setAddress("add_1");student1.setAge("20");*/

        Student student2 = new Student();
        student2.setId(1L);student2.setName("Eslam");
        student2.setAddress("add_1");student2.setAge("20");

        Student student3 = new Student(12L,"Ahmed", "add2", "22");

        Student student4 = new Student();
        student4.setId(1L);student4.setName("Eslam");
        student4.setAddress("add_1");student4.setAge("20");

        Student student5 = new Student();
        student5.setId(1L);student5.setName("Eslam");
        student5.setAddress("add_1");student5.setAge("20");

        Student student6 = new Student();


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        return students;
    }
}

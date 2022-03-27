package com.grig.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                new Student(UUID.randomUUID(),
                        "Alin",
                        "Grigorescu",
                        "alin.grig87@gmail.com",
                        Student.Gender.MALE),
                new Student(UUID.randomUUID(),
                        "Andrei",
                        "Tocan",
                        "andrei.tocan@gmail.com",
                        Student.Gender.MALE),
                new Student(UUID.randomUUID(),
                        "Florin",
                        "Garcineanu",
                        "florin.garcineanu@gmail.com",
                        Student.Gender.MALE)
        );
    }
}

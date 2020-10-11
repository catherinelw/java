package com.wen.demo.controllers;
import com.wen.demo.dtos.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students") public class DemoController {
    @GetMapping
    public ResponseEntity<Student> hello(){
        Student student = new Student();
        student.setFirstName("cat");
        student.setLastName("wen");
        return ResponseEntity.ok(student);
    }
}

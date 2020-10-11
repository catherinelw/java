package com.wen.demo.services;

import com.wen.demo.dtos.Student;
import com.wen.demo.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student createStudent(Student student){
         com.wen.demo.entities.Student studentEntity = new com.wen.demo.entities.Student();
         studentEntity.setFirstName(student.getFirstName());
         studentEntity.setPassword("abc");

         com.wen.demo.entities.Student returnedStudent = studentRepository.save(studentEntity);
        Student returnedDTO = new Student();
        returnedDTO.setFirstName(returnedStudent.getFirstName());
        return returnedDTO;
    }
}

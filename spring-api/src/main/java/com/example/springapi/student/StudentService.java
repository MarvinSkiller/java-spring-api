package com.example.springapi.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudentList(){
        return List.of(
                new Student(
                        "Marvin",
                        "marvinskiller1993@gmail.com",
                        30,
                        LocalDate.now()
                )
        );
    }
}

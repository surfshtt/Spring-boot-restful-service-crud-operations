package ru.test.springstudents.service;

import org.springframework.stereotype.Service;
import ru.test.springstudents.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student updateStudent(Student student);
    void deleteStudentById(int id);
    void addStudent(Student student);
}

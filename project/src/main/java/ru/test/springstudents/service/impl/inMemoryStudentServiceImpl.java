package ru.test.springstudents.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.test.springstudents.model.Student;
import ru.test.springstudents.repository.InMemoryStudentDAO;
import ru.test.springstudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class inMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> getAllStudents() {
        return  repository.getAllStudents();
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public Student getStudentById(int id) {
        return repository.getStudentById(id);
    }

    @Override
    public void deleteStudentById(int id) {
        repository.deleteStudentById(id);
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }
}

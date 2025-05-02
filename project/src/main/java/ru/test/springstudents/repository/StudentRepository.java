package ru.test.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.test.springstudents.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    void deleteById(int id);
    Student findById(int id);
}

package ru.test.springstudents.repository;

import org.springframework.stereotype.Repository;
import ru.test.springstudents.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {
    private final List<Student> STUDENTS = new ArrayList<Student>();

    public List<Student> getAllStudents() {
        return  STUDENTS;
    }

    public Student updateStudent(Student student) {
        var index = IntStream.range(0, STUDENTS.size())
                .filter(indexFS -> STUDENTS.get(indexFS).getName().equals(student.getName()))
                .findFirst()
                .orElse(-1);

        if(index > -1){
            STUDENTS.set(index, student);
            return student;
        }

        return null;
    }

    public Student getStudentById(int id) {
        return STUDENTS.stream().filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void deleteStudentById(int id) {
        var index = getStudentById(id);

        if(index != null){
            STUDENTS.remove(index);
        }
    }

    public void addStudent(Student student) {
        STUDENTS.add(student);
    }
}

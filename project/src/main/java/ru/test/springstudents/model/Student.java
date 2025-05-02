package ru.test.springstudents.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
@Data
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private int age;
}

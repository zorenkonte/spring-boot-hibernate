package com.dark.mode.demo.service;

import com.dark.mode.demo.model.Student;

import java.util.Optional;

public interface StudentService {
    Iterable<Student> getAllStudents();
    Optional<Student> getStudentById(Integer id);
    Student saveStudent(Student s);
    void deleteStudent(Student s);
}

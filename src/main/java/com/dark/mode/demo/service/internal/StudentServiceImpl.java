package com.dark.mode.demo.service.internal;

import com.dark.mode.demo.dao.StudentDAO;
import com.dark.mode.demo.model.Student;
import com.dark.mode.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentDAO studentDAO;

    @Override
    public Iterable<Student> getAllStudents() {
        return studentDAO.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Integer id) {
        return studentDAO.findById(id);
    }

    @Override
    public Student saveStudent(Student s) {
        return studentDAO.save(s);
    }

    @Override
    public void deleteStudent(Student s) {
        studentDAO.delete(s);
    }
}

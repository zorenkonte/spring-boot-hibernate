package com.dark.mode.demo.service;

import com.dark.mode.demo.model.StudentDetail;

import java.util.Optional;

public interface StudentDetailService {
    Iterable<StudentDetail> getAllStudentDetails();
    Optional<StudentDetail> getDetailById(Integer id);
    void deleteDetail(StudentDetail s);
}

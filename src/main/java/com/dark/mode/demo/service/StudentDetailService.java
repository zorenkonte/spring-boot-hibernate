package com.dark.mode.demo.service;

import com.dark.mode.demo.model.StudentDetail;

import java.util.Optional;

public interface StudentDetailService {
    Optional<StudentDetail> getDetailById(Integer id);
}

package com.dark.mode.demo.repository;

import com.dark.mode.demo.model.StudentDetail;
import org.springframework.data.repository.CrudRepository;

public interface StudentDetailRepository extends CrudRepository<StudentDetail, Integer> {
}
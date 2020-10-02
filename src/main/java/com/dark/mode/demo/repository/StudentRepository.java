package com.dark.mode.demo.repository;

import com.dark.mode.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}

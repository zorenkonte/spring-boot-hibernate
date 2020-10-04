package com.dark.mode.demo.repository;

import com.dark.mode.demo.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Integer> {
}

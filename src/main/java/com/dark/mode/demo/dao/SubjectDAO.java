package com.dark.mode.demo.dao;

import com.dark.mode.demo.model.Subject;
import com.dark.mode.demo.repository.SubjectRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectDAO extends SubjectRepository {
    Iterable<Subject> findAllByOrderById();
}

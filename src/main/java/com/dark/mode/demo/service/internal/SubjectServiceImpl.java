package com.dark.mode.demo.service.internal;

import com.dark.mode.demo.dao.SubjectDAO;
import com.dark.mode.demo.model.Subject;
import com.dark.mode.demo.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectDAO subjectDAO;

    @Override
    public Iterable<Subject> getAllSubjects() {
        return subjectDAO.findAll();
    }

    @Override
    public Iterable<Subject> getAllSubjectsOrderById() {
        return subjectDAO.findAllByOrderById();
    }

    @Override
    public Subject saveSubject(Subject s) {
        return subjectDAO.save(s);
    }
}

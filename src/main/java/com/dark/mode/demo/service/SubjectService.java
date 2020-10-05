package com.dark.mode.demo.service;

import com.dark.mode.demo.model.Subject;

public interface SubjectService {
    Iterable<Subject> getAllSubjects();
    Iterable<Subject> getAllSubjectsOrderById();
    Subject saveSubject(Subject s);
}

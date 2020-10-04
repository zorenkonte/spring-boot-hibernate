package com.dark.mode.demo.service;

import com.dark.mode.demo.model.Subject;

public interface SubjectService {
    Iterable<Subject> getAllSubjects();
    Subject saveSubject(Subject s);
}

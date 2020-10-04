package com.dark.mode.demo.resource.v1;

import com.dark.mode.demo.exception.ResourceNotAcceptableException;
import com.dark.mode.demo.model.Subject;
import com.dark.mode.demo.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/subject")
public class SubjectResource {
    private final SubjectService subjectService;

    @GetMapping("/all")
    public Iterable<Subject> all() {
        return subjectService.getAllSubjects();
    }

    @PostMapping("/save")
    public Subject save(@RequestBody Subject s) {
        if (s.getId() != null) {
            throw new ResourceNotAcceptableException("id", s.getId());
        }
        return subjectService.saveSubject(s);
    }
}

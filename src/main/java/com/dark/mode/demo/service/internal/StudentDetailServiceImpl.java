package com.dark.mode.demo.service.internal;

import com.dark.mode.demo.dao.StudentDetailDAO;
import com.dark.mode.demo.model.StudentDetail;
import com.dark.mode.demo.service.StudentDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentDetailServiceImpl implements StudentDetailService {
    private final StudentDetailDAO studentDetailDAO;

    @Override
    public Optional<StudentDetail> getDetailById(Integer id) {
        return studentDetailDAO.findById(id);
    }
}

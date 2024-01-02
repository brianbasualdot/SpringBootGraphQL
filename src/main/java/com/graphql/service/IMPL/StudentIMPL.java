package com.graphql.service.IMPL;

import com.graphql.entities.Student;
import com.graphql.persistence.IStudentDAO;
import com.graphql.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentIMPL implements IStudentService {
    @Autowired
    private IStudentDAO iStudentDAO;

    @Override
    @Transactional(readOnly = true)
    public Student findById(Long id) {
        return iStudentDAO.findById(id).orElseThrow();
        // Que busque el ID y si no lo encuentra que tire un error.
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return (List<Student>) iStudentDAO.findAll();
    }

    @Override
    @Transactional
    public void createStudent(Student student) {
        iStudentDAO.save(student);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        iStudentDAO.deleteById(id);
    }
}

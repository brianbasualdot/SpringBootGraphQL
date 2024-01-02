package com.graphql.service.IMPL;

import com.graphql.entities.Course;
import com.graphql.persistence.ICourseDAO;
import com.graphql.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseIMPL implements ICourseService {

    @Autowired
    private ICourseDAO iCourseDAO;

    @Override
    @Transactional(readOnly = true)
    public Course findById(Long id) {
        return iCourseDAO.findById(id).orElseThrow();
    }
    //// Que busque el ID y si no lo encuentra que tire un error.
    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return (List<Course>) iCourseDAO.findAll();
    }

    @Override
    @Transactional
    public void createCourse(Course course) {
        iCourseDAO.save(course);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        iCourseDAO.deleteById(id);
    }
}

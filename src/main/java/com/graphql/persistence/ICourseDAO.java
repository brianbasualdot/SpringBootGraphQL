package com.graphql.persistence;

import com.graphql.entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourseDAO extends CrudRepository<Course, Long> {
}

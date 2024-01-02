package com.graphql.persistence;

import com.graphql.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDAO extends CrudRepository<Student, Long> {
}

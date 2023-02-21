package com.ozgeakdas.schoolmanagement.repository;

import com.ozgeakdas.schoolmanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
}

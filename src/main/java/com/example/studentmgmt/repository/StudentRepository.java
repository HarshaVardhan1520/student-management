// repository/StudentRepository.java
package com.example.studentmgmt.repository;

import com.example.studentmgmt.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Page<Student> findByNameContainingOrStudentClassContaining(String name, String studentClass, Pageable pageable);
}
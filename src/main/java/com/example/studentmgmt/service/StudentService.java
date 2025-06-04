// service/StudentService.java
package com.example.studentmgmt.service;

import com.example.studentmgmt.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
    Page<Student> getAllStudents(String keyword, Pageable pageable);
    Student getStudentById(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
}

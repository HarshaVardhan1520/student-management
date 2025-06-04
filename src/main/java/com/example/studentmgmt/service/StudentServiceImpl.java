// service/StudentServiceImpl.java
package com.example.studentmgmt.service;

import com.example.studentmgmt.entity.Student;
import com.example.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Page<Student> getAllStudents(String keyword, Pageable pageable) {
        return studentRepository.findByNameContainingOrStudentClassContaining(keyword, keyword, pageable);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

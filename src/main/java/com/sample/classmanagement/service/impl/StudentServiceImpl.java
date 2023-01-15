package com.sample.classmanagement.service.impl;

import com.sample.classmanagement.entity.StudentEntity;
import com.sample.classmanagement.repository.StudentRepository;
import com.sample.classmanagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentEntity addStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public List<StudentEntity> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentEntity> findStudentById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public void removeStudentById(Integer id) {
        studentRepository.deleteById(id);
    }
}
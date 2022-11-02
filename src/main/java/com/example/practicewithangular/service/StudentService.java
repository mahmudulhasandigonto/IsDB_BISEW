package com.example.practicewithangular.service;

import java.util.List;

import com.example.practicewithangular.entity.Student;

public interface StudentService {

   List<Student> getStudentList();

   void postStudent(Student student);

   Student getStudentbyId(Integer studentId);

   Student updateStudentById(Integer studentId, Student student);

   void deleteStudentById(Integer studentId);

}

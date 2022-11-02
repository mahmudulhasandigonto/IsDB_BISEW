package com.example.practicewithangular.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practicewithangular.entity.Student;
import com.example.practicewithangular.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

   @Autowired
   StudentRepository studentRepository;

   @Override
   public List<Student> getStudentList() {
      return studentRepository.findAll();
   }

   @Override
   public void postStudent(Student student) {
      studentRepository.save(student);
   }

   @Override
   public Student getStudentbyId(Integer studentId) {
      return studentRepository.findById(studentId).get();
   }

   @Override
   public Student updateStudentById(Integer studentId, Student student) {
      Student studentDemo = studentRepository.findById(studentId).get();

      if (Objects.nonNull(student.getStudentName()) && !"".equalsIgnoreCase(student.getStudentName())) {
         studentDemo.setStudentName(student.getStudentName());
      }

      if (Objects.nonNull(student.getStudentEmail()) && !"".equalsIgnoreCase(student.getStudentEmail())) {
         studentDemo.setStudentEmail(student.getStudentEmail());
      }

      return studentRepository.save(studentDemo);
   }

   @Override
   public void deleteStudentById(Integer studentId) {
      studentRepository.deleteById(studentId);
   }

}

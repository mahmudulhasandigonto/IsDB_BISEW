package com.example.practicewithangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practicewithangular.entity.Student;
import com.example.practicewithangular.service.StudentService;

@RestController
public class StudentController {

   @Autowired
   StudentService studentService;

   @GetMapping("/connection")
   public String checkConnection() {
      return "Student";
   }

   @GetMapping("/student")
   public List<Student> getStudent() {
      return studentService.getStudentList();
   }

   @PostMapping("/student")
   public String postStudent(@RequestBody Student student) {

      studentService.postStudent(student);

      return "Student Submitted Successfully";
   }

   @GetMapping("/student/{studentId}")
   public Student getStudentById(@PathVariable Integer studentId) {
      return studentService.getStudentbyId(studentId);
   }

   @PutMapping("/student/{studentId}")
   public Student updateStudentById(@PathVariable Integer studentId, @RequestBody Student student) {
      return studentService.updateStudentById(studentId, student);
   }

   @DeleteMapping("student/{studentId}")
   public String deleteStudentById(@PathVariable Integer studentId) {
      studentService.deleteStudentById(studentId);
      return "Student deleted successfully";
   }

}

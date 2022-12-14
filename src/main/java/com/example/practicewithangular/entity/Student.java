package com.example.practicewithangular.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   Integer studentId;
   String studentName;
   String studentEmail;

}

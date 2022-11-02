package com.example.practicewithangular.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practicewithangular.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}

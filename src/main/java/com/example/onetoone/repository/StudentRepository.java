package com.example.onetoone.repository;

import com.example.onetoone.entity1.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students,String> {
}

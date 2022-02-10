package com.example.onetoone.repository;

import com.example.onetoone.entity1.Sports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sports,String> {
}

package com.example.onetoone.repository;

import com.example.onetoone.entity1.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,String> {
}

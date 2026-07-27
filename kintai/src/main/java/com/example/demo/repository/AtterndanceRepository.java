package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Attendance;

public interface AtterndanceRepository extends JpaRepository<Attendance, Long>{

}

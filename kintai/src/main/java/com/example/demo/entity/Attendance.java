package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// 社員ID
	private Long employeeId;
	// 勤務日
	private LocalDate workDate;
	// 出勤時刻
	private LocalDateTime clockIn;
	// 退勤打刻
	private LocalDateTime clockOut;
	
	protected Attendance() {}
	
	public boolean isWorking() {
		return clockOut == null; 
	}
}

package com.capgemini.icici.domain.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	
	
		Employee employee;

		@BeforeEach
		void setUp() {
			employee=new Employee(1234,"swathi",15000,2500);
		}
		
		@Test
		void testcalEmployeeSalary() {
			assertEquals(23000,employee.calEmployeeSalary());
		}
		@AfterEach
		void tearDown() {
			employee = null;
		}
	}

	



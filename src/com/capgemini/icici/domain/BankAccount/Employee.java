package com.capgemini.icici.domain.BankAccount;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double hra;
	private double pf;
	private  final double pt = 200;
	private double medical;
	private double basicSalary;
	private double netSalary;
	private double grossSalary;

	public Employee(){
		}

	public Employee(int employeeId, String employeeName,double basicSalary,double medical) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public double calEmployeeSalary() {
		hra = 0.5 * basicSalary;
		pf = 0.12 * (basicSalary);
		grossSalary = basicSalary +hra + medical;
		netSalary = grossSalary - (pf + pt);
return netSalary;
	}
	public void displayBankAccountDetails() {
		System.out.println("Employee Id : " + employeeId + "\nEmployee name: " + employeeName+  
				"\nEmployee Net Salary: " + netSalary );
	}
}

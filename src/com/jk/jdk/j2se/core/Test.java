package com.jk.jdk.j2se.core;

import com.jk.jdk.j2se.core.bean.Address;
import com.jk.jdk.j2se.core.bean.Employee;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Jitendra");
		
		employee = findEmployee(employee);
		
		System.out.println(employee);
	}

	public static Employee findEmployee(Employee employee) {
		for(Employee emp : Employee.getEmployees()) {
			if(emp.getName().equals(employee.getName())){
				return emp;
			}
		}
		
		return new Employee();
	}
	
}

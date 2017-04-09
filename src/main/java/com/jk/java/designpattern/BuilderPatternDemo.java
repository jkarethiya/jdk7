/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 28-Jun-2015 7:32:09 pm
 */
package com.jk.java.designpattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		Employee emp = new Employee.EmployeeBuilder().firstName("Jitendra").lastName("Arethiya").salary(710000).createInstance();
		
		System.out.println(emp);
	}

}


class Employee {
	
	private Employee(EmployeeBuilder eb) {
		super();
		this.firstName = eb.firstName;
		this.lastName = eb.lastName;
		this.salary = eb.salary;
	}

	private String firstName;
	private String lastName;
	private float salary;	
	
	
	public static class EmployeeBuilder {
		private String firstName;
		private String lastName;
		private float salary;	
		
		public EmployeeBuilder firstName(String firstName) {
			this.firstName = firstName;
			
			return this;
		}
		
		public EmployeeBuilder lastName(String lastName) {
			this.lastName = lastName;
			
			return this;
		}
		
		public EmployeeBuilder salary(float salary) {
			this.salary = salary;
			
			return this;
		}
		
		public Employee createInstance() {
			return new Employee(this);
		}
	}
	
	@Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "}";
    } 

}
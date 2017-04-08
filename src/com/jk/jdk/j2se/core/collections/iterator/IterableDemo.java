/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 23-Jun-2015 10:45:22 am
 */
package com.jk.jdk.j2se.core.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 23-Jun-2015 10:45:22 am
 */
public class IterableDemo {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1, "jk");
		Employee e2 = new Employee(2, "tj");
		Employee e3 = new Employee(3, "ah");
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		
		Employee employee = new Employee(employeeList);
		
		for(Employee emp : employee) {
			System.out.println(emp.getId() + " : " + emp.getName());
		}
		
		employee = new Employee(employeeList);
		Iterator<Employee> empIterator = employee.iterator();
		
		while(empIterator.hasNext()) {
			//System.out.println(empIterator.next().getId());
			empIterator.remove();
			
			break;
		}
		
		employee = new Employee(employeeList);
		
		for(Employee emp : employee) {
			System.out.println(emp.getId() + " : " + emp.getName());
		}
		
			
	}

}


class Employee implements Iterable<Employee> {

	List<Employee> employeeList = new ArrayList<Employee>();
	

	public Employee(List<Employee> employeeList) {
		super();
		this.employeeList = employeeList;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	private int id;
	private String name;

	@Override
	public Iterator<Employee> iterator() {
		return new EmployeeIterator(this);
	}

	private class EmployeeIterator implements Iterator<Employee> {

		private List<Employee> employeeList;
		private int position;
		
		public EmployeeIterator(Employee employee) {
			this.employeeList = employee.getEmployeeList();
		} 
		
		@Override
		public boolean hasNext() {
			if(position < this.employeeList.size())
				return true;
			else
				return false;
		}

		@Override
		public Employee next() {
			return employeeList.get(position++);			
		}
		
		@Override
		public void remove() {
			employeeList.remove(position);
		}
		
	}
	
}
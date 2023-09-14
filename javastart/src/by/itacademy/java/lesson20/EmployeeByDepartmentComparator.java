package by.itacademy.java.lesson20;

import java.util.Comparator;


	public class EmployeeByDepartmentComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getDepartment().compareTo(o2.getDepartment());
		}
	}
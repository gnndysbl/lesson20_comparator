package by.itacademy.java.lesson20;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp3 = new Employee(212514, "Sidorov O.P.", "operations", 100500);
		Employee emp2 = new Employee(212510, "Pologov O.P.", "technical", 2000);
		Employee emp1 = new Employee(212516, "Asatov O.P.", "cleaning", 500);

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println();

		Set<Employee> staff = new TreeSet<>();
		staff.add(emp1);
		staff.add(emp2);
		staff.add(emp3);

		for (Employee emp : staff) {
			System.out.println(emp);
		}

		Set<Employee> staffById = new TreeSet<>(new EmployeeByIdComparator());
		staffById.addAll(staff);
		System.out.println("\n" + "ById");
		for (Employee emp : staffById) {
			System.out.println(emp);
		}

		
		Set<Employee> staffByName = new TreeSet<>(new EmployeeByNameComparator());
		staffByName.addAll(staff);
		System.out.println("\n" + "ByName");
		for (Employee emp : staffByName) {
			System.out.println(emp);
		}
		
		Set<Employee> staffByDepartment = new TreeSet<>(new EmployeeByDepartmentComparator());
		staffByDepartment.addAll(staff);
		System.out.println("\n" + "ByDepartment");
		for (Employee emp : staffByDepartment) {
			System.out.println(emp);
		}

	}

}

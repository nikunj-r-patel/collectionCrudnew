package collectionServiceRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import collectionEntity.Employee;
import collectionEntity.Skills;

public class EmployeeServiceRepository {

	public static int creatEmployee(Employee employee) {
		// TODO Auto-generated method stub
		List<Employee> empList=new LinkedList<Employee>();
		ArrayList<Skills> empSkills=new ArrayList<>();
		empSkills.add(new Skills("java", "spring", "jdbc", "sql", "hibernate"));
		
		
		empList.add(new Employee(101, "nikunj", empSkills, 36, 50000.00, "08-26-2023"));
		return 0;
	
	} 

}

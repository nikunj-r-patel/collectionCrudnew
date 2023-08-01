package collectionServicesImpl;

import collectionEntity.Employee;
import collectionServiceRepository.EmployeeServiceRepository;
import collectionServices.EmployeeServices;

public class EmployeeServiceImpl implements EmployeeServices {

	@Override
	public int creatEmployeeList(Employee employee) {
		// TODO Auto-generated method stub
		return EmployeeServiceRepository.creatEmployee(employee);
	}

}

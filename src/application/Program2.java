package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1: department findById ===");
		Department dep =  departmentDao.findById(7);
		System.out.println(dep);
		
		System.out.println("=== Test 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		
		for(Department d: list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== Test 3: department insert ===");
		Department department2 =  new Department(null, "Cinema");
		departmentDao.insert(department2);
		System.out.println("Inserted! Id = " + department2.getId());
		
		System.out.println("\n=== Test 4: department Update ===");
		dep =  departmentDao.findById(7);
		dep.setName("Sports");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n=== Test 5: department delete ===");
		departmentDao.deleteById(8);
		System.out.println("Delete completed!");
	}

}

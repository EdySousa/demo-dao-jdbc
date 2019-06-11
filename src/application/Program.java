package application;

import java.text.ParseException;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {


		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: seller findById ===");
		Seller saller = sellerDao.findById(3);
		System.out.println(saller);

		
		System.out.println("\n=== Test 2: seller findByDepartmentId ===");
		
		Department department = new Department(2, null);

		List<Seller> sellers = sellerDao.findByDepartment(department);
		
		for (Seller seller : sellers) {
			System.out.println(seller);
		}
		
	}

}

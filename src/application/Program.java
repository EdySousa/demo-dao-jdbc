package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Saller;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department department = new Department(2, "Books");

		Saller saller = new Saller(1, "Ed", "ed@gmail.com", sdf.parse("16/05/1989"), 1200.0, department);

		System.out.println(department);
		System.out.println(saller);

	}

}

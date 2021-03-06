package info.pablogiraldo.nghello.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import info.pablogiraldo.nghello.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TestController {
	private List<Employee> employees = createList();

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> firstPage() {
		return employees;
	}

	private static List<Employee> createList() {
		List<Employee> tempEmployees = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setName("fulano");
		emp1.setDesignation("supervisor");
		emp1.setEmpId("1");
		emp1.setSalary(3000);
		Employee emp2 = new Employee();
		emp2.setName("mengano");
		emp2.setDesignation("contable");
		emp2.setEmpId("2");
		emp2.setSalary(1000);
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		return tempEmployees;
	}
}

package EmployeeTask;

public class Demo {
	
	public static void main(String[] args) throws CompanyException {
		
		ICompany company = new Company("Omv");
		
		company.addEmployee(new Employee("Gosho", 22, 1500), "HR");
		company.addEmployee(new Employee("Mihaela", 19, 1455), "Cleaning");
		company.addEmployee(new Employee("Valkata", 45, 45000), "HR");
		company.addEmployee(new Employee("Vasq", 45, 45000), "Cleaning");
		company.addEmployee(new Employee("Sonq", 45, 45000), "Relax");
		
		company.listAllEmployees();
		
		
		
		
		
		
	}

}

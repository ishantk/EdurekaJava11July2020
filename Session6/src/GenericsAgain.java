class Employee{
	
	String name;
	String email;
	int salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, String email, int salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
}

class PermanentEmployee extends Employee{
		
}

class ContractEmployee extends Employee{
	
}

class EmployeeData<T, U>{
	
	T eid;
	U employee;
	
	public EmployeeData() {
		eid = null;
		employee = null;
	}
	
	public EmployeeData(T eid, U employee) {
		this.eid = eid;
		this.employee = employee;
	}

	@Override
	public String toString() {
		String data = "EmployeeData [eid=" + eid + ", employee=" + employee + "]";
		return data;
	}
}


public class GenericsAgain {

	public static void main(String[] args) {
		
		Employee eRef1 = new Employee("John", "john@example.com", 50000);
		
		EmployeeData<Integer, Employee> eData = new EmployeeData<Integer, Employee>(101, eRef1);
		
		EmployeeData<Integer, PermanentEmployee> eData1 = new EmployeeData<Integer, PermanentEmployee>();
		EmployeeData<Integer, ContractEmployee> eData2 = new EmployeeData<Integer, ContractEmployee>();
		
		
		System.out.println(eRef1);
		System.out.println(eData);

	}

}


public class Employee {
	
	private int empID;
	private String empName;
	private int deptID;
	private String status;
	private int salary;


	public Employee(int empID, String empName, int deptID, String status, int salary) {
		//super();
		this.empID = empID;
		this.empName = empName;
		this.deptID = deptID;
		this.status = status;
		this.salary = salary;		
	}
	
	public int getEmpID() {
		return this.empID;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	public int getDeptId() {
		return this.deptID;
	}

	public String getStatus() {
		return this.status;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public int setEmpID(int empID) {
		return this.empID = empID;
	}
	
	public String setEmpName(String empName) {
		return this.empName = empName;
	}
	
	public int setDeptId(int deptID) {
		return this.deptID = deptID;
	}

	public String setStatus(String status) {
		return this.status = status;
	}
	
	public int setSalary(int salary) {
		return this.deptID = salary;
	}


}

//encapsulation --> binding data with methods
class Employee{
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp= new Employee();
		emp.setEmpId(1);
		System.out.println(emp.getEmpId());
		emp.setEmpName("name");
		System.out.println(emp.getEmpName());
	}

}

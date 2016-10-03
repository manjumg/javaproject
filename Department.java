public class Department implements oraganisation {
	public String sDeptName;
	public String sDeptCode;

	public void createEmployee(String sEmpName, float fSalary, String sEmpUSN,
			String sGender, String sDOB, String sDOj, String sPost,
			String deptName, String deptCode) {
		Employee vijay = new Employee(sEmpName, fSalary, sEmpUSN, sGender,
				sDOB, sDOj, sPost, sDeptName, sDeptCode);
		vijay.detailEmployee();
	}

	@Override
	public void createDepartment(String sDeptName, String sDeptCode) {
		this.sDeptName = sDeptName;
		this.sDeptCode = sDeptCode;
	}
	public void displayDepartment()
	{
		System.out.println("Department Name : "+this.sDeptName);
		System.out.println("Deprtment Code : "+this.sDeptCode);
	}
}

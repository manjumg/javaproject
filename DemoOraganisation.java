import java.util.Scanner;

public class DemoOraganisation {
	public static void main(String[] args) {
		String sEmpName;
		float fSalary;
		String sEmpUSN;
		String sGender;
		String sDOB;
		String sDOj;
		String sPost;
		Department cs = new Department();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		sEmpName = in.next();
		System.out.println("Enter Empleyee Salary");
		fSalary = in.nextFloat();
		System.out.println("Enter USN");
		sEmpUSN = in.next();
		System.out.println("Enter Gender");
		sGender = in.next();
		System.out.println("Enter Date Of Birth");
		sDOB = in.next();
		System.out.println("Enter Date Of Joining");
		sDOj = in.next();
		System.out.println("Enter post");
		sPost = in.next();
		System.out.println("Enter Department Name");
		String deptName = in.next();
		System.out.println("Enter Department Code");
		String deptCode = in.next();
		
		cs.createDepartment(deptName, deptCode);
		cs.displayDepartment();
		System.out.println("\n");

		cs.createEmployee(sEmpName, fSalary, sEmpUSN, sGender, sDOB, sDOj,sPost, deptName, deptCode);
		System.out.println("Total number of employee : "+Employee.slNO);

	}
}

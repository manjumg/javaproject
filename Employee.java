public class Employee extends Department{
	static int slNO;
	String sEmpName;
	public float fSalary;
	public String sEmpUSN;
	public String sGender;
	public String sDOB;
	public String sDOj;
	public String sPost;
	public int iTotalEmp;


	public Employee(String sEmpName, float fSalary, String sEmpUSN,String sGender, String sDOB, String sDOj, String sPost,String sDeptName,String sDeptCode) {
		this.sEmpName = sEmpName;
		this.fSalary = fSalary;
		this.sEmpUSN = sEmpUSN;
		this.sGender = sGender;
		this.sDOB = sDOB;
		this.sDOj = sDOj;
		this.sPost = sPost;
		this.sDeptName=sDeptName;
		this.sDeptCode=sDeptCode;
	}

	void detailEmployee(){
		System.out.println("Employee detail's\n------------------------\nUSN : "+this.sEmpUSN);
		System.out.println("Name : "+this.sEmpName);
		System.out.println("GENDER : "+this.sGender);
		System.out.println("Date Of Birth : "+this.sDOB);
		System.out.println("Date Of Joining "+this.sDOj);
		System.out.println("SALARY : "+this.fSalary);
		System.out.println("POST : "+this.sPost);
		System.out.println("Department Name : "+this.sDeptName);
		System.out.println("Department Code : "+this.sDeptCode);

		this.iTotalEmp = slNO++;
	}
}

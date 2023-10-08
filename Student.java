package week2.assignments;

public class Student extends Department
{
	public void studentName()
	{
	
		System.out.println("Karthiga");
	}
	public void studentDept()
	{
		System.out.println("BCA");
	}
	public String studentID(String ID)
	{
		System.out.println(ID);
		return ID;
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Student std=new Student();
		std.collegeName();
		std.collegeRank();
		std.collegeCode(105);
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentID("U10E10254");
		
	}

}

package week2.assignments;

public class MethodOverload 
{
	public int getStudentInfo(int ID)
	{
		System.out.println("Student ID :" + ID);
		return ID;
		
	}
	public void getStudentInfo(String code, String name)
	{
		System.out.println("Student code : " +code);
		System.out.println("Student name :" +name);
	}
	public void getStudentInfo(String mail,String Phone,String dept)
	{
		System.out.println("Student contact info :");
		System.out.println("Mail id is : " +mail);
		System.out.println("contact  : " +Phone);
		System.out.println("Department : " +dept);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodOverload obj=new MethodOverload();
		obj.getStudentInfo(12);
		obj.getStudentInfo("102", "Karthiga");
		obj.getStudentInfo("test@123.com", "98746310", "BCA");
	}

}

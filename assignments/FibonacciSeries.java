package week1.assignments;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int range=8;
		int firstNum=-1;
		int secNum=1;
		int fibo;
		//System.out.println(firstNum);
		//System.out.println(secNum);
		for(int i=0;i<range;i++)
		{
			fibo=firstNum+secNum;
			firstNum=secNum;
			secNum=fibo;
			System.out.println(fibo);
		}
	}
}
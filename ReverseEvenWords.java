package week2.assignments;
import java.util.Arrays;

public class ReverseEvenWords
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String text="I am a software tester";
		String res="";
		String[] value = text.split(" ");
		System.out.println(value.length);
		System.out.println(Arrays.toString(value));
		for(int i=value.length-1;i>=0;i--)
			
		{
			 res=res+value[i] + " ";  //tester=tester+ software
			 
		}
		
		System.out.println(res);

	}

}




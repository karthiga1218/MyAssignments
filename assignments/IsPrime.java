package week1.assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10 ;
		int i;
		int count=0;
		
		for(i=1;i<=n;i++) {
			if (n%i==0){
			count = count+1;
			}
			//n=n+1;
			}
		if(count==2)
			System.out.println(n + " is Prime");
		else
			System.out.println(n + " is not Prime");
	}
	

}

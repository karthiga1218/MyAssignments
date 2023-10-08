package week2.assignments;

public class AxisBank extends BankInfo
{

	public void deposit()
	{
		super.deposit(); // to call method from parent class
		System.out.println("Amount deposited in Axis bank account no : Acc246455");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AxisBank bank=new AxisBank();
		bank.deposit();
		bank.saving();
	
	}

}

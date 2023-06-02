package week1.day1;

public class Primenumber2 {


	public static void main(String[] args) {
		int myinput = 13;
		boolean flag = false;
		for(int i=2;i<12/2;i++)
		{
			if (myinput%i==0)
			{
				flag=true;
				break;
				
			}
			
		}
		
		if (flag==false)
		{
			System.out.println("prime number "+myinput);
				}
		else
		{
			System.out.println("not a prime number "+myinput);
		}
	}
	

}

package week1.day2;

public class Duplicate {

	public Duplicate() {
		
	}

	public static void main(String[] args) {
		
  int [] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

for (int i=0;i<arr.length;i++)
	
{
	int element = arr[i];
	for(int j = i+1; j<arr.length;j++)
	{
		if (element == arr[j])
		{
		System.out.println("Duplicate "+ element);
		break;
		}
	}
}
  
  
	}

}
 
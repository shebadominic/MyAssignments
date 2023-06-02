package week1.day2;

public class FindIntersection {

	

	public static void main(String[] args) {
		int arrayone[] = {3,2,11,4,6,7};
		int arraytwo[] = {1,2,8,4,9,7};
		
		for (int i=0;i<arrayone.length-1;i++)
		{
			for (int j=0;j<arraytwo.length-1;j++)
			{
				if (arrayone[i]==arraytwo[j])
				{
					System.out.println(arrayone[i]);
				}
			}
		}

	}

}

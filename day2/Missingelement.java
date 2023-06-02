package week1.day2;

import java.util.Arrays;

public class Missingelement {

	
	public static void main(String[] args) {
		int[] arrayone = {1,2,3,4,7,6,8};
		Arrays.sort(arrayone);
		for(int i=0; i<arrayone.length-1;i++)
		{
		int element = i+1;
		if(element !=arrayone[i])
		{
			System.out.println(element);
			break;
		}
		}

	}

}

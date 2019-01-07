package ca.demo.salestool;

public class SalesData {

	int data [] = {0,4,42,158};
	
	public void display()
	{
		System.out.println("Data:");
		for (int i = 0; i < data.length; i++) 
		{
			if(i>0)
			{
				System.out.println("\t previous value >> " + data[i-1]);
			}
			System.out.println("\t next value >> " + data[i]);
			
			System.out.println("----");
		}
	}
}

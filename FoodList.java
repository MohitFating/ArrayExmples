package Array;
import java.util.Scanner;

public class Exe2
{
	public static void main(String[] args)
	{
		System.out.println("Entet food item Count :\n");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		sc.nextLine();
		
		String[] Food = new String[size];
		
		for(int i=0 ; i<size; i++)
		{
			System.out.println("\n"+"Enter Food Name " +(i+1) + ":");
			Food[i]=sc.nextLine();		
			
		}
		System.out.println("\n" +"-----------------------------" + "\n" + "\n" + "Given Food Name Following : ");
		for(int i=0;i<size;i++)
		{
			System.out.println((i+1) + ":" + Food[i]);
		}
		
		
	}
}

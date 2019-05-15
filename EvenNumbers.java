import java.util.*;
public class EvenNumbers{
	public static void main(String[] args)
	{
		int n=0,i=0;
		Scanner X = new Scanner(System.in);
		System.out.println("Enter value of n");
		n=X.nextInt();
		for(i=1;i<n;i++)
		{
			if(i%2==0)
				System.out.println(i + " ");
		}
		System.out.println();	
	}
}
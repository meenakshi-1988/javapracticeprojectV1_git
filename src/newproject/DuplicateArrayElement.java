package newproject;

import java.util.Scanner;

public class DuplicateArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] nums= new int[10];
			Scanner s = new Scanner(System.in);
			System.out.println("Enter number of elements");
			int n=s.nextInt();
		
			for (int i=0; i<n;i++){
				nums[i]=s.nextInt();
				
			}
			
			for (int i=0; i<n;i++){
				System.out.println(+nums[i]);
				
			}	
			
			for (int i=0;i<n;i++)
			{
				for (int j=0;j<n;j++)
				{
				if (i==j&& j!=n-1)
				{
					j=j+1;
					if (nums[i]==nums[j])
					{
						System.out.println("duplicate");
					}
					else{
						
					
				}
				}
					
				}
			}
	}

}

import java.util.*;
class example3
{
  public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of 2D matrix.");
    int n=sc.nextInt();
    int m=sc.nextInt();
    int A[][]=new int[n][m];
    System.out.println("Enter elements in matrix.");
    for(int r=0;r<n;r++)
    	for(int c=0;c<m;c++)
    		A[r][c]=sc.nextInt();
    for(int r=0;r<n;r++)
    	{for(int c=0;c<m;c++)
            System.out.print(A[r][c]+" ");
            System.out.println();
    	}
    
    
    
}
}
import java.io.*;
class example4
{   //return all possible combinations of k numbers out of 1...n
	 
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values of n and k.");
		int n=Integer.parseInt(br.readLine());
		int k=Integer.parseInt(br.readLine());
		int A[]=new int[n];
		for(int i=0;i<n;i++)
			A[i]=i+1;
		int K[]=new int[k];
		int c=0;
		int r=1;
		loop(A,K,n,k,r,c);
	}
	public static void loop(int A[],int K[],int n,int k,int r,int c)
	{  r=
		while()
	}
	public static void display(int K[])
	{
		for (int i=0;i<K.length;i++)
			System.out.print(K[i]);
		System.out.println();
		return;
	}
		
	}

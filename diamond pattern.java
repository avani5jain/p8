import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{ for(k=i;k<=n;k++)
		{ System.out.print(" ");}
		    for(j=1;j<=i;j++)
		{ System.out.print("* ");}
		System.out.println();
		}
		for(i=1;i<=n;i++)
		{
		for(k=(n-i+1);k<=n;k++)
		{ System.out.print(" ");}
		for(j=i;j<=n;j++)
		{ System.out.print("* ");}
		
		System.out.println();
	}
	}
}

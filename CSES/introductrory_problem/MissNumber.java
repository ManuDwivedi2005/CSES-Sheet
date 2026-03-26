package CSES.introductrory_problem;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MissNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n=Integer.parseInt(bf.readLine());
		int[] arr=new int[n];
		StringTokenizer st=new StringTokenizer(bf.readLine());
		for(int i=0;i<n-1;i++){
		    arr[i]=Integer.parseInt(st.nextToken());
		}
		
		long accsum=(long)n*(n+1)/2;
		long sum=0;
		for(var x:arr){
		    sum+=x;
		}
		
		long ans=accsum-sum;
		out.println(ans);
		out.flush();
		out.close();
 
	}
}

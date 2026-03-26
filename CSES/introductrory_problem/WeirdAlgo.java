package CSES.introductrory_problem;

import java.lang.*;
import java.io.*;

public class WeirdAlgo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader bf =new BufferedReader(new InputStreamReader (System.in));
        PrintWriter out=new PrintWriter(System.out);
        long n=Long.parseLong(bf.readLine());
        out.print(n+" ");
        while(n!=1){
            if(n%2==0){
                long x=n/2;
                out.print(x+" ");
                n=x;
            }else{
                long x=(n*3)+1;
                out.print(x+" ");
                n=x;
            }
        }
        
        out.flush();
        out.close();
	}
}

package CSES.introductrory_problem;

import java.util.*;
import java.lang.*;
import java.io.*;

public class IncArr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out =new PrintWriter(System.out);
        int n=Integer.parseInt(bf.readLine());
        StringTokenizer s=new StringTokenizer(bf.readLine());
        long maxsofar=Long.parseLong(s.nextToken());
        long move=0;
        for(int i=1;i<n;i++){
            long curr=Long.parseLong(s.nextToken());
            
            if(curr<maxsofar){
                move+=(maxsofar-curr);
            }else{
                maxsofar=curr;
            }
        }
        
        out.println(move);
        out.flush();
        out.close();
	}
}

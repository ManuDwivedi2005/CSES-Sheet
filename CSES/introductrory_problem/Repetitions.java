package CSES.introductrory_problem;

import java.lang.*;
import java.io.*;

public class Repetitions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String s=bf.readLine();
        int max=1,cnt=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                cnt=1;
            }else{
                cnt++;
                max=Math.max(max,cnt);
            }
        }
        
        out.println(max);
        out.flush();
        out.close();
	}
}

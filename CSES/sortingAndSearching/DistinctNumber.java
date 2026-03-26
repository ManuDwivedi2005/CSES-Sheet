package CSES.sortingAndSearching;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DistinctNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        int[] arr=new int[n];
        StringTokenizer st=new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int cnt=1;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

//https://www.hackerrank.com/challenges/30-review-loop/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<x;i++)
        {
            String s1,s2;
            s1 = s2 =" ";
            String s=scan.next();
            char[] charArray=s.toCharArray();
            for(int j=0;j<charArray.length;i+=2){
                 s1 += charArray[i];   
                }
                for(int j=1;j<charArray.length;j+=2){
                    s2 +=charArray[j];
                }                                                   
            
            System.out.println(s1+" "+s2);
        }
    }
}
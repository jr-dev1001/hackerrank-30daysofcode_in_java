//https://www.hackerrank.com/challenges/30-binary-numbers/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int i=0,rem=0,cons=0;
        while(n>0)
        {
            rem=n%2;
            n=n/2;
            if(rem==1)
            {
                cons++;
                if(cons>i)
                 i=cons;
            }
            else{
                cons=0;
            }
        }
        System.out.println(i);
        bufferedReader.close();
    }
}
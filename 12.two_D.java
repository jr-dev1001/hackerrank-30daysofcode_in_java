//https://www.hackerrank.com/challenges/30-2d-arrays/problem
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

        List<List<Integer>> arr = new ArrayList<>();
        int maxsum=-64;  
        int hoursum;   
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                hoursum=arr[i+1][j+1];    
                for(int k=0;k<3;k++){                   
                    hoursum = hoursum + arr[i][j+k] + arr[i+2][j+k]; 
                }             
                if(hoursum > maxsum)         
                maxsum = hoursum;       
            }      
        }     
        System.out.println("%d",maxsum);

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

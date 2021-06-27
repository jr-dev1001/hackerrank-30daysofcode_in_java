//https://www.hackerrank.com/challenges/30-sorting/problem
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



public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
// Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        Integer temp;
        // Write your code here
        for (int i=0; i < a.size(); i++) {
            for (int j = 0; j < a.size()-i-1; j++) {
        // Swap adjacent elements if they are in decreasing order
                if (a.get(j).compareTo(a.get(j+1)) > 0)
                {
                    temp = a.get(j);
                    a.set(j,a.get(j+1) );
                    a.set(j+1, temp);
                    numberOfSwaps++;
                }
    }
    
    // If no elements were swapped during a traversal, array is sorted
    if (numberOfSwaps == 0) {
        break;
        }
    }
    System.out.println("Array is sorted in "+numberOfSwaps+ " swaps.");
    System.out.println("First Element: "+a.get(0));
    System.out.println("Last Element: "+a.get(n-1));
        bufferedReader.close();
    }
}
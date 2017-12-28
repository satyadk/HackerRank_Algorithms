import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[][] a = new int[n][n];
    int d1 = 0;
    int d2 = 0;
    for(int a_i = 0;a_i < n;a_i++) {
           for(int a_j = 0;a_j < n;a_j++) {
              a[a_i][a_j] =scan.nextInt();
           }
            d1 = d1 + a[a_i][a_i];
            d2 = d2 + a[a_i][n-1-a_i];
        }
        
        System.out.println(Math.abs(d1-d2));
    
    }
}
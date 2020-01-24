
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author int320
 */
public class BigOsample {

    private static final int N = 100_000;
    static Random r = new Random();

    public static void main(String[] args) {

//        int[] ary = new int[N];
//        for (int i = 0; i < ary.length; i++) {
//            ary[i] = r.nextInt();
//
//        }
       
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
         
        for (int i = 0; i < N; i++) {
            a[i] = r.nextInt();
        }
        long begin = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }      

        System.out.println((System.currentTimeMillis()- begin));
        long begin2 = System.currentTimeMillis();
        Arrays.sort(a);
         System.out.println((System.currentTimeMillis()- begin2));
        

    }

//https://www.sanfoundry.com/java-program-sort-array-ascending-order/
}

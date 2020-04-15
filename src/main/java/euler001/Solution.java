package euler001;

import java.util.*;

public class Solution {

    public static boolean MultipleOfThree(long i) {
        if (i % 3 == 0) {
            return true;
        }
        return false;
    }
    
    public static boolean MultipleOfFive(long i) {
		if (i % 5 == 0) {
            return true;
        }
        return false;
    }
    
    public static long SumOfMultiples(long n) {

        // first add up multiples of 3
        // 3 + 6 + 9 + ... + final
        // num_items = (n - 1) / 3
        // final = num_items * 3
        // sum = (3 + final) * (num_items / 2)
        long num_items3 = (n - 1) / 3;
        long final3 = num_items3 * 3;
        long sum3 = (3 + final3) * num_items3;
        sum3 = sum3 / 2;

        // now add up multiples of 5
        // 5 + 10 + 15 + ... + final
        // num_items = (n - 1) / 5
        // final = num_items * 5
        // sum = (5 + final) * (num_items / 2)
        long num_items5 = (n - 1) / 5;
        long final5 = num_items5 * 5;
        long sum5 = (5 + final5) * num_items5;
        sum5 = sum5 / 2;

        // now add up multiples of 15
        // 15 + 30 + 45 + ... + final
        // num_items = (n - 1) / 15
        // final = num_items * 15
        // sum = (15 + final) * (num_items / 2)
        long num_items15 = (n - 1) / 15;
        long final15 = num_items15 * 15;
        long sum15 = (15 + final15) * num_items15;
        sum15 = sum15 / 2;

        // add multiples of 3, plus multiples of 5
        // subtract multiples of 15, which are counted twice
        return sum3 + sum5 - sum15;
        
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(SumOfMultiples(n));
        }
        in.close();
    }
	
}
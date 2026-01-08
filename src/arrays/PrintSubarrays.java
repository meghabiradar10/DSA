package arrays;
import java.util.*;
public class PrintSubarrays {
    public static void PrintSub(int numbers[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for(int k = start; k <= end; k++) {
                    System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k];
                }
                ts++;
                System.out.print(" Sum = " + sum);
                System.out.println();

                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(minSum, sum);
            }
            System.out.println();
        }
        System.out.println("total subarrays = " + ts);
        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.println("Minimum Subarray Sum = " + minSum);
        
    }
    public static void main(String args[]) {
int numbers[] = {2, 4, 6, 8, 10};
PrintSub(numbers);
    }
}

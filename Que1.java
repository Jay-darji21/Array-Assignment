// Que.1 for 1D Array
// WAP to print the sum of all the elements present on even index of the given array 

import java.util.*;

public class Que1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array : ");
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // Sum of elements present on even index

        int sum = 0;

        for(int i = 0 ; i<n ; i++)
        {
            if(i%2 == 0)
            {
                sum += arr[i];
            }
        }

        System.out.println("Sum : "+sum);
    }
}
// Que.4 for 2D array
// WAP to find the largest element of the array

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();
        
        // User inputted Array
        int arr[][] = new int[m][n];
        System.out.println("Enter the matrics");
        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int largest = 0;

        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                largest = Math.max(largest, arr[i][j]);
            }
        }

        System.out.println("Largest number : "+ largest);

    }
}

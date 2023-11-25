// 2D array
// Print the number of 0,positive and negative in the array entered by the user

import java.util.*;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        // User entered the array
        System.out.println("Enter the array : ");
        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int positive=0 , negative = 0 , odd = 0 ,even = 0, zero = 0;

        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                if(arr[i][j] > 0)positive++;
                if(arr[i][j] < 0)negative++; 
                if(arr[i][j] == 0)zero++;
                if(arr[i][j]%2 == 0)even++;
                if(arr[i][j]%2 != 0 )odd++;
                 
            }
        }

        System.out.println("Number of positive = "+positive);
        System.out.println("Number of negative = "+negative);
        System.out.println("Number of zero = "+zero);
        System.out.println("Number of odd = "+odd);
        System.out.println("Number of even = "+even);


    }
}

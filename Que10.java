// Que 5 for 2D array
// Write a function which accept the 2D array and print the elemnets to the middle row and middle column
import java.util.*;
public class Que10 {

    // Function for printing the middle row and column

    public static void Array(int arr[][] , int m , int n)
    {
        System.out.println("Elemnets of middle row and columns : ");
        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0  ; j<n ; j++)
            {
                if(i==m/2 || j==n/2)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        // User input for Array
        System.out.println("Enter the matrics : ");
        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // function calling
        Array(arr, m, n);

    }
}

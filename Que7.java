// Que.2 for 2D array
// WAP the program to print the elements above the 2nd diagonal of square matrics
import java.util.Scanner;
public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();
        
        // User inputted Array
        int arr[][] = new int[m][n];
        if(m!=n)
        {
            System.out.println("Enter the valid input");
            sc.close();
            return;
        }
        System.out.println("Enter the matrics");
        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int l = arr.length;

        System.out.println("Elements abvove the secondary diagonal matrics are : ");

        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                if(i+j<l-1)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }


    }
}

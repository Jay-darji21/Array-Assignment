// Que.3 for 1D array
// Write a program to calculate the maximum element of the array

public class Que3{
    public static void main(String[] args) {
        int arr[] = {4,3,6,7,1};
        int n = Integer.MIN_VALUE;
        for(int i : arr)
        {
            n = Math.max(n,i);
        }
        System.out.println(n);
    }
}
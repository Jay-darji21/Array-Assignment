// WAP to find the first peak element in the given array

public class Que5 {
    public static void main(String[] args) {
        int arr[] = {1,3,2,6,5};
        int n = arr.length;
        int m=0;
        for(int i = 1 ; i<n-1 ; i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                 m = arr[i];
            }
        }
        System.out.println(m);
    }
}

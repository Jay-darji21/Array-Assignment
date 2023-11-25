// Que.4 1D Array
// WAP to find the second largest element in the array {34,21,54,65,43}

public class Que4 {
    public static void main(String[] args) {

        int arr[] = {34,21,54,50,43};
        int largest,second;

        largest = second = Integer.MIN_VALUE;

        // Find the largest number
        for(int i : arr)
        {
            largest = Math.max(largest, i);
        }
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i] != largest)
            {
                second = Math.max(second, arr[i]);
            }
        }
        

        System.out.println(second);
    }
}

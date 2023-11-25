
//  1D - Que.2 
//  WAP to traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all
//  even elements


public class Que2 {
    public static void main(String[] args) {
        int arr[] = {34,21,54,65,43};
        for(int i : arr)
        {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}

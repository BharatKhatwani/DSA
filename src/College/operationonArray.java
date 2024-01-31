package College;

import java.util.Scanner;

public class operationonArray {
    public static int minimumArray(int[] arr){
        int min = arr[0];
        for (int i =1 ; i<arr.length; i++){
            int e = arr[0];
            if (min>arr[i]){
min= arr[0];

            }
            return min;


        }
        return min;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[]  = new int[5];
        for (int i =0; i<arr.length ; i++){
            System.out.print("Element no");
            System.out.println(i++ +":" );
             arr[i] = sc.nextInt();
        }
        for (int element :arr){
            System.out.println(element);
        }

    }
}

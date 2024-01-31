package recession;

public class k5_BS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,12,15,20,25,36,45,56,75,85,96,100,110,120,140,160,170,180};
        int target = 100;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

   static int search(int[] arr , int target , int start , int end ){
        if ( start>end){
            return -1;
        }
        int m = start + (end - start) /2;
        if (arr[m]  == target){
            return m;
        }
        if (target< arr[m]){
            return search(arr , target , start, m-1);

        }
        return search(arr , target , m+1 , end);
   }
}
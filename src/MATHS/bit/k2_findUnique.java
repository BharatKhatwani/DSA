package MATHS.bit;

public class k2_findUnique {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,6,7,6,7};
        System.out.println(ans(arr));
    }
    public static int ans(int [] arr){
        int unique = 0;
        for(int i=0; i <arr.length ;i++){
     unique ^=arr[i];
        }
        return unique;
    }

}

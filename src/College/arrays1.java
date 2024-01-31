package College;

public class arrays1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,8,10,12,16};
        System.out.println("No of even number in array are : ");
        System.out.println(hello(arr));
    }
    public static int  hello(int[] arr){
        int count =0;
        for(int i =0; i <arr.length ; i++){
            if (arr[i] %  2 ==0){
                count++;

            }

        }
        return   count ;
    }
}

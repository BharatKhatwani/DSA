package searching.binearySEarch;

public class k4_floors {
    public static void main(String[] args) {
        int [] arr = {2,3,7,9,12,34,56,75};
        int target = 12;
        System.out.println(search(arr,target));


    }
    static int search(int [] arr, int target){
        int start =0;
        int end = arr.length -1;

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;

            if (target > arr[mid]){
                start = mid +1;
            }
            else if (target<arr[mid]) {
                end = mid -1;
            }
            else {
                return mid ;
            }
        }
        return end;
    }
}


/*
floor: greathest number which is smaller and equal to that number


condition are voilented so that
end     target    start then we are the end in it 
 */
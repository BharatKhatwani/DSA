package searching.linear_Search;

public class k3_search_in_RAnge {
    public static void main(String[] args) {
        int [] arr =  {1,2,3,4,5,6,45,85,69};
        int target = 3;
        System.out.println(search(arr,target,0,5));
    }
    static int search(int [] arr , int target , int start , int end){
        if (arr.length==0){
            return -1;
        }
        for (int index = start; index <end ; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}

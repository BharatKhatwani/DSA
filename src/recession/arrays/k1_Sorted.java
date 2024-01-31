package recession.arrays;



// in the code it is only return true and false etc
public class k1_Sorted
{
    public static void main(String[] args)
    {
int [] arr = {5,6,8,12,1,2,3};
        System.out.println(sorted(arr,0));

   }
   static boolean sorted(int [] arr , int index){
    if (index == arr.length -1){
        return true;
    }
return arr[index] < arr[index+1] && sorted(arr,index+1);
    }
}
//}

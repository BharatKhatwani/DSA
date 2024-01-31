package recession.striver;

public class p1 {
    // print 1 to 5
    public static void main(String[] args) {
     //   System.out.println(print2(10));
     // print1(10);
  //   print(1,10);
   //  printreverse(10,1);
        //  sum(3,0);
     //   System.out.println(sum(3));;
        System.out.println(fatocial(5));
    }
    static int print (int nums,int target){
       if (nums>target){
       return target;

       }
        System.out.println(nums);
      return print(nums+1,target);
    }
static int printreverse(int nums,int target){
        if (nums <  target){
            return target;
        }
    System.out.println(nums);
        return printreverse(nums-1,target);
}
public static void sum (int num,int sum){
        if (num<1){
            System.out.println(sum);
            return ;
        }
        sum(num -1 , sum+num);
}
public static int sum(int num){
        if (num==0) return 0;
      return   num+sum(num-1);
}
public static int fatocial(int num){
        if (num==1) return 1;
        return num * fatocial(num-1);
}
}
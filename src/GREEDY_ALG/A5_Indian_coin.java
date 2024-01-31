package GREEDY_ALG;
import java.util.*;

public class A5_Indian_coin {
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int count =0;
      //  Scanner Sc = new Scanner(System.in);
        int amount = 2513;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=0; i < coins.length; i++){
            if(coins[i] <=amount){
                while(coins[i] <= amount){
                    count++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
        }
        System.out.println("Total (min) coins used = " + count);
        for (int i =0 ; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}

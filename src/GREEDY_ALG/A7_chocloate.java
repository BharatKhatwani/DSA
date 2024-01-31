package GREEDY_ALG;
import java.util.*;
public class A7_chocloate {
    public static void main(String[] args) {
        int n = 4,m =6;
        Integer costver[] = {2,1,3,1,4}; // n-1
        Integer costhor[] = {4,1,2};
        Arrays.sort(costver, Collections.reverseOrder());
        Arrays.sort(costhor,Collections.reverseOrder());

        int h =0,v =0;
        int hp=1,vp =1;
        int cost =0;



        while (h<costhor.length && v < costver.length){
            // vertical cost <horizontal cost
            if(costhor[v] <= costhor[h]){  // horizonal cut
cost += (costhor[h] * vp );
hp++;
h++;
            }else {// vertical cut
              cost += (costver[v] *hp);
              vp++;
              v++;

            }
        }
        while (h <costhor.length){
            cost += (costver[v] *hp);
            hp++;
            h++;
        }
        while (v < costhor.length){
            cost += (costver[v] *hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cut = " + cost);
    }
}

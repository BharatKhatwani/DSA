package Hashmap;

import java.util.HashMap;

public class c5_Isomorphic {
    public boolean isIsomorphic (String s , String t){

        HashMap <Character,Character> mp = new HashMap<>();
        // we are  travilling in whole string
        for (int i=0 ; i <s.length() ; i++){
Character sch = s.charAt(i);
Character tch = t.charAt(i);
if (mp.containsKey(sch)){
    if (mp.get(sch ) != tch){
     return false ;
    }
    else if (mp.containsKey(tch)){
        return false ;

    } else {
        mp.put(sch ,tch);
    }
}
        }
        return true;
    }


}

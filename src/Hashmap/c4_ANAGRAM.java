package Hashmap;
import javax.swing.text.AttributeSet;
import java .util.*;
public class c4_ANAGRAM {
// make its method and thn call it



        public static HashMap<Character, Integer> makeFreqSet(String str) {
            HashMap<Character, Integer> mp = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                Character ch = str.charAt(i);
                if (!mp.containsKey(ch)) {
                    mp.put(ch, 1);
                } else {
                    int currentFreq = mp.get(ch);
                    mp.put(ch, currentFreq + 1);
                }
            }
            return mp;
        }

        public static boolean isAnagram1(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            HashMap<Character, Integer> mp1 = makeFreqSet(s);
            HashMap<Character, Integer> mp2 = makeFreqSet(t);
            return mp1.equals(mp2);
        }


        // 2 approx

        public boolean isAnagram2(String s , String t){
            if (s.length() != t.length()){
                return false ;
            }
HashMap <Character,Integer> mp = makeFreqSet(s);
            for (int i =0 ; i<t.length(); i ++){
                Character ch = t.charAt(i);
                if (!mp.containsKey(ch)) return false ;
                int currentFreq = mp.get(ch);
                mp.put(ch,currentFreq-1);
            }
for(Integer i : mp.values()){
    if(i!= 0) return false ;
}
return true;
        }

    }


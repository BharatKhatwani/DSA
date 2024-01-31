package searching;

public class SearchinString {
    public static void main(String[] args) {
        String name = "kunal";
char target = 'u';
        System.out.println(search(name,target));
    }
  static boolean search (String str , char target){
if ( str.length() ==0){ // it is function of str.length
    return false; // case 1 your are not writing any value
}
for ( int i =0; i <str.length();i++){
    if (target == str.charAt(i)){
        return true;          // you are return the value of if it marking
    }
}
return false; // value not marking
  }

}

package searching.linear_Search;



public class k2_SearchInString {
    public static void main(String[] args) {
        String str = "Kunal";
        char ch = 'b';
        System.out.println(search(str,ch));
    }
    public static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int index = 0; index <str.length(); index++){
        if( target == str.charAt(index)){
            return true;
        }


        }
        return false;
    }
}

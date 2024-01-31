package STRING;

public class k6_Performance {
    public static void main(String[] args) {
        String series = " ";
       for (int i =25; i >=0 ; i--){
           char ch= (char)('a'+i );
           series = series + ch +" " ;
        }

        System.out.println(series);
    }

    }

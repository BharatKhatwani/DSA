package pattern;

public class practice {
    public static void main(String[] args) {
        aditya(4, 5);
    }
    static void aditya(int n, int m){
         for (int row =1; row <=n; row++)
        {
            for(int col =1; col <=m; col++)
            {
                if ( row == col ||  row < col)
                {
                    System.out.print("*");
                }
else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
//11 12 13 14 15
//21 22 23 24 25
//31 32 33 34 35
//41 42 43 44 45



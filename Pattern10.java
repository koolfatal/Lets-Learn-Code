package LetCode;
import java.util.*;

public class Pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------  ENTER THE NUMBERS OF ROWS AND COLUMNS ------");
    
            int n=sc.nextInt();
            int number =1;
           
    
            //rows
            for(int i=1;i<=n;i++){
            //columns
                for(int j=1;j<=i;j++){
                        System.out.print(" "+number+" ");
                        number++;
                }
               
                System.out.println();
            }
        }
    
}

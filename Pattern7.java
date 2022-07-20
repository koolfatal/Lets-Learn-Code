package LetCode;
import java.util.*;

public class Pattern7 {
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------  ENTER THE NUMBERS OF ROWS AND COLUMNS ------");
    
            int n=sc.nextInt();
           
    
            //rows
            for(int i=n;i>=1;i--){
            //columns
                for(int j=1;j<i;j++){
                        System.out.print(" ");
                }
                for(int j=0;j<=n-i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}


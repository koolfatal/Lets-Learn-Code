package LetCode;
import java.util.*;

public class Pattern11 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------  ENTER THE NUMBERS OF ROWS AND COLUMNS ------");
    
            int n=sc.nextInt();
            int number =1;
           
    
            //rows
            for(int i=1;i<=n;i++){
            //columns
                for(int j=1;j<=i;j++){
                    if((i+j) %2 == 0){
                        System.out.print(1+" ");
                    }
                    else{
                        System.out.print(0 +" ");
                    }
                }
               
                System.out.println();
            }
        }
    
}

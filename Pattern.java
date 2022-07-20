package LetCode;
import java.util.*;


public class Pattern {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("------  ENTER THE NUMBERS OF ROWS AND COLUMNS ------");

        int n=sc.nextInt();
        int m=sc.nextInt();

        //rows
        for(int i=0;i<n;i++){
        //columns
            for(int j=0;j<m;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}


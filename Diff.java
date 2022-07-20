package LetCode;
import java.util.Scanner;

public class Diff {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------  ENTER THE NUMBERS ------");
    
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c = (a-b);

            System.out.println("DIFF of two numbers --->"+" "+ c);
    
}

}

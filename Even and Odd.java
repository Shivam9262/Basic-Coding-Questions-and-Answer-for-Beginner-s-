import java.util.*;
/**
 * Even_and_Odd
 */
public class Even_and_Odd {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter a number: ");
        n=sc.nextInt();
        if(n%2==0 || n==0){
            System.out.println("Given number is an even number! ");
        }
        else 
        System.out.println("Given number is a odd number! ");
    }
}

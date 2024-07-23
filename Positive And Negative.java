import java.util.*;

public class Positive_And_Negative {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n>0){
            System.out.println("Positive Number");
        }
        else
        if (n<0) {
            System.out.println("Negative Number");
        }
        else
        System.out.println("Zero");
    }
}

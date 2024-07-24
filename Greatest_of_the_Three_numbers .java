import java.util.*;
public class Greatest_of_the_Three_numbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter th value of a :");
        a=sc.nextInt();
        System.out.printf("Enter th value of b :");
        b=sc.nextInt();
        System.out.printf("Enter th value of c :");
        c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is greater! ");

        }
          
        else
        if(b>a && b>c){
            System.out.println("B is greater!");

        }
        else
        System.out.println("C is greater!");

    }
}

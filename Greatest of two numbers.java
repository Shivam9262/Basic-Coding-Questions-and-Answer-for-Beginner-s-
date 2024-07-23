import java.util.*;
public class Greatest_of_two_numbers {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the value of number 1: ");
        num1=sc.nextInt();
        System.out.printf("Enter the value of number 2: ");
        num2=sc.nextInt();
        if (num1>num2){
        System.out.println("Number 1 is greater! ");


        }
        else
        if(num2>num1){
            System.out.println("Number 2 is greater! ");
        }
        else
        {
            System.out.println("Number 1 and Number 2 is equal! ");
        }
    }
}

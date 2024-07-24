/**
 * Sum_of_the_Number_in_a_Given_Range
 */
import java.util.*;
public class Sum_of_the_Number_in_a_Given_Range {
public static void main(String[] args) {
    int num1,num2;
    Scanner sc=new Scanner(System.in);
    System.out.printf("Enter the first number:");
    num1=sc.nextInt();
    System.out.printf("Enter the second number:");
    num2=sc.nextInt();
    int sum=0;

    for (int i=num1; i <=num2;i++){
        sum=sum+i;
    }
  
    System.out.println("Sum of the number in the given range :"+sum);
}
    
}

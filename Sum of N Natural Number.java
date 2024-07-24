import java.util.*;
public class Sum_of_N_Natural_Number {
    public static void main(String[] args) {
        int num ;
        Scanner sc=new Scanner(System.in);
    
        System.out.printf("Enter a  positive number ");
        num=sc.nextInt();
    int sum=0;
    for(int i=1;i<=num;i++){
        sum=sum+i;
    }
    System.out.println("Sum of N natural number is : "+sum);

    }
}

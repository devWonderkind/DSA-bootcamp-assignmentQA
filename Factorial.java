import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, fact;
        fact =1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = in.nextInt();
        for(i=1; i<=number; i++){
           fact = fact*i;
        }
        System.out.println("Factorial of the " +number+ " is " +fact);
    }
}

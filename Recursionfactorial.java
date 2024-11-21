package controlStatement;


import java.util.Scanner;

public class Recursionfactorial
{
    public static int factorial(int n)
    {
        if (n == 0 || n == 1) {
            return 1;
        } else
        {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

}









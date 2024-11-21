package controlStatement;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        int a = 4;
        int fact = 1;
        // int c=1,b=1;
        System.out.println("This output is for  loop ");
        for (int i = 1; i <= a; i++) {
            fact *= i;

        }
        System.out.println(fact);
    }
}
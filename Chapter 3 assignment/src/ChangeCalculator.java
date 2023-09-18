import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an amount less than $1.00: ");
        double amount = scanner.nextDouble();
        
        if (amount >= 1.00) {
            System.out.println("Amount must be less than $1.00");
            return;
        }
        
        int cents = (int) (amount * 100); // Convert dollars to cents
        
        int quarters = cents / 25;
        cents %= 25;
        
        int dimes = cents / 10;
        cents %= 10;
        
        int nickels = cents / 5;
        cents %= 5;
        
        int pennies = cents;
        
        System.out.println("Minimum number of coins:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        
        scanner.close();
    }
}

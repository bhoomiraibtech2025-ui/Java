package Assement15;
import java.util.Scanner;

class atm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int correctPIN = 1234;

        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();

        try
        {
            if (pin != correctPIN)
            {
                throw new Exception("Invalid PIN");
            }

            System.out.println("PIN Verified Successfully");
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        finally
        {
            System.out.println("PIN verification process completed.");
        }

        sc.close();
    }
}
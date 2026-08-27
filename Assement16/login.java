package Assement16;


import java.util.Scanner;

class Login
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "12345";

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try
        {
            if (!password.equals(correctPassword))
            {
                throw new Exception("Invalid Password");
            }

            System.out.println("Login Successful");
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        finally
        {
            System.out.println("Login process completed");
        }

        sc.close();
    }
}
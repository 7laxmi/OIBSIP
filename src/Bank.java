import java.util.Scanner;

class Withdraw extends Bank
{
    int withdrawAmount;
    public void printBalance()
    {
        System.out.println(" The Current Balance : " + balance);
        System.out.println();
    }
    // The function to Withdraw an amount and update the balance
    public int withdraw()
    {                                                                      
        System.out.println( "Withdrawn Operation :" );
        System.out.println("The withdrawing Amount is : " +withdrawAmount );
        if (balance >= withdrawAmount) 
        {
            balance = balance - withdrawAmount;
            System.out.println( "Please collect your money and remove the card" );
            printBalance();
        }
        else 
        {
            System.out.println( "Sorry! the balanace is insufficient." );
            System.out.println();
        }


        return balance;
    }

    int depositAmount;
    public int deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Deposit Operation :" );
        
        depositAmount = sc.nextInt();
        System.out.println(" The depositing amount is : " + depositAmount);
        balance = balance + depositAmount;
        System.out.println( "Your Money has been successfully deposited" );
        sc.close();
        return balance;
    }
} 

public class Bank 
{
    int balance = 400000;
    static int withdrawAmount;
    static int depositAmount;
    public static void main(String args[]) 
    {
        Scanner obj = new Scanner(System.in);
        String user_id;

        System.out.println("Welcome to the ATM");
        do
        {
        System.out.println("Enter the user id : ");
        user_id = obj.nextLine();
        }
        while(user_id.length() !=10);
        System.out.println("\n The User id is correct Please Proceed.");


        String user_pin;
        do
        {
        System.out.println("Enter the pin : ");
        user_pin = obj.next();
        }
        while(user_pin.length() !=4);
        System.out.println("\n The User Pin is correct Please proceed");
        obj.close();

        
        Scanner sc = new Scanner(System.in);
        Withdraw w = new Withdraw();
        w.printBalance();
        w.withdraw();
        w.deposit();
        sc.close();
    }
}
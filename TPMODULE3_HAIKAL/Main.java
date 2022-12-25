import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Restaurant restoran = new Restaurant();
        int customerID, orderQty;

        try {
            System.out.print("Enter Customer ID : ");
            customerID = scr.nextInt();

            System.out.print("Enter how much Food to made : ");
            orderQty = scr.nextInt();

            Thread Thread1 = new Thread(restoran);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread Thread2 = new Thread(waiter);

            Thread1.start();
            Thread2.start();
            Thread1.join();
            Thread2.join();

        } 
        
        catch (Exception e) {
            System.out.println("Input must be Integer");

        }

        scr.close();

    }

}
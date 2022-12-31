import java.util.Scanner;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Calculation computation = new Calculation();

        boolean repeat = false;

        Thread Thrd1 = new Thread(computation);

        Scanner scr = new Scanner(System.in);

        do {
            System.out.println("==Menu Program==");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            System.out.println("Select Menu : ");

            int clc = scr.nextInt();

            try {
                switch (clc) {

                    case 1:
                        System.out.println("Enter the length of the side of the square : ");
                        computation.setSquare(clc);
                        Thrd1.start();
                        Thrd1.join();
                        System.out.println("=====");
                        System.out.println("The calc result: " + computation.getSquare());
                        break;

                    case 2:
                        System.out.println("Enter the radius of the circle : ");
                        computation.radius = scr.nextDouble();
                        computation.setCircle(clc);
                        Thrd1.start();
                        Thrd1.join();
                        System.out.println("=====");
                        System.out.println("The calculation result is: " + computation.getCircle());
                        break;

                    case 3:
                        System.out.println("insert the side of the base of the trapezoid: ");
                        double a = scr.nextDouble();
                        System.out.println("Enter the upper side of the trapezoid: ");
                        double b = scr.nextDouble();
                        System.out.println("Enter height: ");
                        double c = scr.nextDouble();
                        computation.setTrapezoid(b, c, clc);
                        Thrd1.start();
                        Thrd1.join();

                        System.out.println("=====");
                        System.out.println("The calculation result : " + computation.getTrapezoid());
                        break;

                    default:

                        System.out.println("Options not available");
                        break;
                }
            } catch (InputMismatchException a) {
                System.out.println("====Erorr:: Input must be number====");

            } catch (IllegalArgumentException e) {
                System.out.println("java.lang.IllegalArgumentException");
            }

        } while (repeat);
        scr.close();

    }
}
import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of item 1");
        double p1 = sc.nextInt();
        System.out.println("enter quantity of item 1");
        int q1 = sc.nextInt();
        System.out.println("enter the price of item 2");
        double p2 = sc.nextInt();
        System.out.println("enter quantity of item 2");
        int q2 = sc.nextInt();
        System.out.println("enter the price of item 3");
        double p3 = sc.nextInt();
        System.out.println("enter quantity of item 2");
        int q3 = sc.nextInt();

        double subtotal = (p1*q1)+(p2*q2)+(p3*q3);
        System.out.println("subtotal from order is " + subtotal);

        double tax = subtotal * .055;
        System.out.println("tax:" + tax);

        double total = subtotal + tax;
        System.out.println("order total:" +total);
    }


}

import java.util.Scanner;
public class shoppingCart {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency='$';
        double total;

        System.out.println("Enter  the item: ");
        item=sc.nextLine();
        System.out.println("Enter price of item:");
        price=sc.nextDouble();
        System.out.println("How much quantity:");
        quantity=sc.nextInt();
        total=price*quantity;
        System.out.println("Total: "+currency+total);
        sc.close();
    }
}
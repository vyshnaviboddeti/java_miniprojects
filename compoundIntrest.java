import java.util.Scanner;

public class compoundIntrest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        System.out.println("enter principal amount :");
        principal = sc.nextDouble();
        System.out.println("enter rate (in %) :");
        rate = sc.nextDouble();
        System.out.println("enter no. of timesCompounded per year :");
        timesCompounded = sc.nextInt();
        System.out.println("enter no of years:");
        years = sc.nextInt();
        amount = principal * Math.pow(1+rate/timesCompounded,timesCompounded*years);
        System.out.println("The amount after" + years + "is :" +amount);
        sc.close();
    }
}

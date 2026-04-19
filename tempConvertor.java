import java.util.Scanner;

public class tempConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = 0;
        double newTemp = 0;
        String units;
        System.out.println("enter the temperature:");
        temp = sc.nextDouble();
        System.out.println("enter the units : ");
        units = sc.next().toUpperCase();
        newTemp = (units.equals("C")) ? (temp * 9 / 5) + 32 : (temp - 32) * 5 / 9;
        String resultUnit = units.equals("C") ? "F" : "C";
        System.out.println(newTemp + " " + resultUnit);
        sc.close();
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;
public class maths {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;
        Scanner sc = new Scanner(System.in);
        width = sc.nextDouble();
        height = sc.nextDouble();
        area = width * height;
        System.out.println("area is " + area);
        sc.close();
    }
}

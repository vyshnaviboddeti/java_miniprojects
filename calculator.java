import java.util.Scanner;
public class calculator{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        double num1;
        double num2;
        char op;
        double result=0;
        System.out.print("Enter the num1:");
        num1=sc.nextDouble();
        System.out.print("Enter the operator:");
        op=sc.next().charAt(0);
        System.out.print("Enter the num2:");
        num2=sc.nextDouble();

        switch(op){
            case '+' ->result=num1+num2;
            case '-' ->result=num1-num2;
            case '*' ->result=num1*num2;
            case '/' ->{
                if(num2==0)
                    System.out.println("cannot divide by zero");
                else
                    result=num1/num2;
            }
            case '^' ->result=Math.pow(num1,num2);
        }
        System.out.println("Result:"+result);
        sc.close();
    }
}
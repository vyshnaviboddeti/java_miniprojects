import java.util.Scanner;
public class weightConverter{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;
        System.out.println("convert lbs to kgs");
        System.out.println("convert kgs to lbs");
        System.out.println("choose an option : ");
        choice=sc.nextInt();

        if(choice==1){
            System.out.println("Enter weight in lbs");
            weight=sc.nextDouble();
            newWeight=weight*0.45356;
            System.out.println(newWeight);
        }
        else if(choice==2){
            System.out.println("Enter weight in kgs");
            weight=sc.nextDouble();
            newWeight=weight*2.45356;
            System.out.println(newWeight);
        }
        else{
            System.out.println("Enter valid choice");
        }
        sc.close();
    }
}
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which device is used to connect different networks?",
                "2. What does CPU stand for?",
                "3. Which company developed Java?",
                "4. Who is known as the father of computers?",
                "5. Which data structure uses FIFO (First In First Out)?"
        };

        String[][] options = {
                {"1. Switch", "2. Router", "3. Keyboard", "4. Monitor"},
                {"1. Central Process Unit", "2. Computer Personal Unit", "3. Central Processing Unit", "4. Control Processing Unit"},
                {"1. Microsoft", "2. Apple", "3. Sun Microsystems", "4. Google"},
                {"1. Alan Turing", "2. Charles Babbage", "3. Bill Gates", "4. Elon Musk"},
                {"1. Stack", "2. Queue", "3. Tree", "4. Graph"}
        };

        int[] answers = {2, 3, 3, 2, 2};

        int score = 0;

        System.out.println("🎯 Welcome to the Quiz Game!");
        System.out.println("-----------------------------");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer is option " + answers[i]);
            }
        }

        System.out.println("\n===========================");
        System.out.println("🎉 Your Final Score: " + score + "/" + questions.length);
        System.out.println("===========================");

        sc.close();
    }
}
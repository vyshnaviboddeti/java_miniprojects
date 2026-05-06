import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class AlarmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filepath="Perfect-(Mr-Jat.in).wav";
        while (alarmTime == null) {
            try {
                System.out.print("enter alarm time:");
                String inputTime = sc.nextLine();
                alarmTime = LocalTime.parse(inputTime,formatter);
                System.out.println("alarm set for:" + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("invalid format");

            }

        }
        AlarmClock alarmClock=new AlarmClock(alarmTime,filepath,sc);
        Thread alarmThread =new Thread(alarmClock);
        alarmThread.start();

    }
}

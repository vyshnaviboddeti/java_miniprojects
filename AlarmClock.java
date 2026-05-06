import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    private final String filepath;
    private final Scanner sc;

    AlarmClock(LocalTime alarmTime, String filepath,Scanner sc) {

        this.alarmTime = alarmTime;
        this.filepath = filepath;
        this.sc=sc;
    }

    @Override
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);

                int hours = LocalTime.now().getHour();
                int minutes = LocalTime.now().getMinute();
                int seconds = LocalTime.now().getSecond();

                System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);


            } catch (InterruptedException e) {
                System.out.println("thread was interrupted");
            }

        }
        System.out.println("\nalarm noises");
        playSound(filepath);
    }

    private void playSound(String filepath) {
        File audioFile = new File(filepath);
        try (AudioInputStream audiostream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
            clip.start();
            System.out.print("press enter to stop the alarm");
            sc.nextLine();
            clip.stop();
            sc.close();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("audio file format is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("audio unavailable");
        }
        catch (IOException e) {
            e.printStackTrace();  // THIS WILL SHOW REAL ERROR
        }
    }
}
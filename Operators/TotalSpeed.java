import java.util.Scanner;

public class TotalSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float totalDistance = 24 * 1.6f;

        float hr = 1;
        float min = 40;
        float sec = 35;

        float totalTime = hr + (min / 60) + (sec / (60 * 60));

        float avgSpeed = totalDistance / totalTime;

        System.out.println("The average speed in km/hr : " + avgSpeed);

    }

}

package org.harry.ProgrammingChallenges;

import java.time.LocalTime;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.MINUTES;

public class SpeedTracker {


    public static void main(String[] args){
        Scanner timeInput = new Scanner(System.in);
        System.out.println("Time at the first camera?");
        String firstSpeed = timeInput.nextLine();

        System.out.println("Time at the second camera?");
        String secondSpeed = timeInput.nextLine();

        System.out.println("Distance between the cameras?");
        long distance = Long.parseLong(timeInput.nextLine());

        LocalTime firstTime = LocalTime.parse(firstSpeed);
        LocalTime secondTime = LocalTime.parse(secondSpeed);

        float timeDifference = firstTime.until(secondTime, MINUTES);

        System.out.println("Time between camera: " + timeDifference);

        float speed = distance / (timeDifference / 60);

        System.out.println("Average speed of the vehicle is " + Math.round(speed));
    }

}

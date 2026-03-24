package HolidayTask;

import java.util.Scanner;

public class SubwayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String obstacle = "TRAIN";
        System.out.println("Obstacle: " + obstacle);

        System.out.println("Enter move (LEFT, RIGHT, JUMP, ROLL): ");
        String move = sc.next().toUpperCase();

        switch (obstacle) {

            case "TRAIN":
                switch (move) {
                    case "LEFT":
                    case "RIGHT":
                        System.out.println(" Escaped the train!");
                        break;
                    default:
                        System.out.println(" Caught by train!");
                }
                break;

            case "BARRIER":
                switch (move) {
                    case "JUMP":
                        System.out.println(" Jumped over barrier!");
                        break;
                    default:
                        System.out.println(" Hit the barrier!");
                }
                break;

            case "COIN":
                System.out.println("Collected coin!");
                break;

            default:
                System.out.println(" Running safely...");
        }
    }
}

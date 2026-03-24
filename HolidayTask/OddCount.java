package HolidayTask;

import java.util.Scanner;

public class OddCount {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        int count = (high + 1) / 2 - (low) / 2;

        System.out.println(count);
    }
}

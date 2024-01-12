import java.lang.Math;
import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] dataPoints = new int [100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int)(Math.random() * 100) + 1;
        }

        int num = InputHelper.getRangedInt(scan, "Please enter a number: ", 1, 100);
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == num) {
                count++;
            }
        }
        System.out.println(num + " appears " + count + " times in the array.");

        num = InputHelper.getRangedInt(scan, "Please enter another number: ", 1, 100);

        int index = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == num) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(num + " is not in the array.");
        } else {
            System.out.println(num + " appears at index " + index);
        }
    }
}
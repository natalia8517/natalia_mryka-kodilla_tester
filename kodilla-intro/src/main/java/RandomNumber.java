import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        drawNumbers();
    }

    public static void drawNumbers() {
        Random randomNumber = new Random();
        int sum = 0;
        int maxNum = 0;
        int minNum = 30;

        while (sum <= 5000) {
            int number = randomNumber.nextInt(30);
            sum = sum + number;

            if (number > maxNum){
                 maxNum = number;
            }
             if (number <= minNum){
                minNum = number;
             }
        }
        System.out.println("Max number was " + maxNum + " Min number was " + minNum);
    }
}
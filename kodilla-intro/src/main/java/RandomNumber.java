import java.util.Arrays;
import java.util.Random;

public class RandomNumber {

     int maxNum = 0;
     int minNum = 30;

    public static void main(String[] args) {
        RandomNumber randNum = new RandomNumber();
        randNum.drawNumbers();
    }

    public void drawNumbers() {
        Random randomNumber = new Random();
        int sum = 0;

        while (sum <= 5000) {
            int number = randomNumber.nextInt(30+1);
            sum = sum + number;

            getMax(number);
            getMin(number);
        }
        System.out.println("Max number was " + maxNum + " Min number was " + minNum);
    }

    public  void getMax(int number){
        if (number > maxNum){
            maxNum = number;
        }
    }

    public void getMin(int number){
        if (number <= minNum){
            minNum = number;
        }
    }
}
import java.util.Random;

public class Loops {
    public static void main (String[] args) {
        int num[] = new int[]{1, 2, 4, 6, 8};
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        for (i=0; i<=10; i++){
            System.out.println(i);
        }
        System.out.println(getCountOfRandomNumber(110));
        // System.out.println(SumNumbers(num));
    }
    public static int SumNumbers(int[] numbers){
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
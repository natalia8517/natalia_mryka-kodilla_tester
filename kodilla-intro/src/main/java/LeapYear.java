public class LeapYear {
    public static void main(String[] args){
        int year = 2024;
        checkIfItsLeapYear(year);
    }
    public static void checkIfItsLeapYear(int yearNumber){
        if ((yearNumber%4==0 && yearNumber%100==0 && yearNumber%400==0) || (yearNumber%4==0 && yearNumber%100!=0)){
            System.out.println(yearNumber + " is a leap year");
        }
        else{
            System.out.println(yearNumber + " is not a leap year");
        }
    }
}
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int month, day;
        String sign;
        
        System.out.print("Enter birth-month: ");
        month = input.nextInt();
        
        System.out.print("Enter birth-day: ");
        day = input.nextInt();
        
        if (month == 1) {
            if (day <= 21) {
                sign = "Capricorn";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Aquarius";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 2) {
            if (day <= 19) {
                sign = "Aquarius";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Pisces";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 3) {
            if (day <= 20) {
                sign = "Pisces";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Aries";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 4) {
            if (day <= 20) {
                sign = "Aries";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Taurus";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 5) {
            if (day <= 21) {
                sign = "Taurus";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Gemini";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 6) {
            if (day <= 22) {
                sign = "Gemini";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Cancer";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 7) {
            if (day <= 22) {
                sign = "Cancer";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Leo";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 8) {
            if (day <= 22) {
                sign = "Leo";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Virgo";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 9) {
            if (day <= 22) {
                sign = "Virgo";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Libra";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 10) {
            if (day <= 22) {
                sign = "Libra";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Scropio";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 11) {
            if (day <= 21) {
                sign = "Scorpio";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Sagitarius";
                System.out.print("Your sign: "+ sign);
            }
        } else if (month == 12) {
            if (day <= 21) {
                sign = "Sagitarius";
                System.out.print("Your sign: "+ sign);
            } else {
                sign = "Capricorn";
                System.out.print("Your sign: "+ sign);
            }
        }
    }
}

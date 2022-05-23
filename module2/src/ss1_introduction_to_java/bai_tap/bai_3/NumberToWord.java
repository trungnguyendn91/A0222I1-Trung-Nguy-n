package ss1_introduction_to_java.bai_tap.bai_3;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int number = scanner.nextInt();
        int hundred = number/100;
        int tens = (number%100)/10;
        int unit = number%10;
        if (number <=10){
            switch (number){
                case 0 : System.out.println("Không");
                break;
                case 1 : System.out.println("Một");
                break;
                case 2 : System.out.println("Hai");
                break;
                case 3 : System.out.println("Ba");
                break;
                case 4: System.out.println("Bốn");
                break;
                case 5 : System.out.println("Năm");
                    break;
                case 6 : System.out.println("Sáu");
                    break;
                case 7 : System.out.println("Bảy");
                    break;
                case 8 : System.out.println("Tám");
                    break;
                case 9 : System.out.println("Chín");
                    break;
                case 10 : System.out.println("Mười");
                    break;
                default: System.out.println("Out of ability");
            }
        }else if (number >10 && number <100){

        }
    }

}

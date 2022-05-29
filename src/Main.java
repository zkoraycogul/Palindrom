import java.util.Scanner;

public class Main {
    static boolean isPalindrom (int number) {
        int temp = number, reverseNumber= 0, lastNumber;
        while(temp != 0) {
            lastNumber = temp%10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp = temp/10;
        }
        return reverseNumber == number ? true : false;
    }

    public static void main(String[] args) {
        System.out.print("Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(isPalindrom( number ));


    }
}

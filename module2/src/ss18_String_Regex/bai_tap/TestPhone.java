package ss18_String_Regex.bai_tap;

import java.util.Scanner;

public class TestPhone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời nhập số điện thoại");
        String numberPhone;
        do {
            numberPhone=scanner.nextLine();

        }while (!PhoneNumber.validate(numberPhone));
    }
}

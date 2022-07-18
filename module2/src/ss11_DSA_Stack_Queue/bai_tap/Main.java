package ss11_DSA_Stack_Queue.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String a = scanner.nextLine();
        System.out.println(a);
        CheckBrackets.check(a);
        System.out.println(CheckBrackets.check(a));
    }
}

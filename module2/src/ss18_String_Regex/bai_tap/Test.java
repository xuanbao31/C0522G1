package ss18_String_Regex.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập lớp bạn muốn kiểm tra");
        String school;
        do {
            school=scanner.nextLine();
        }while (!NameClassRegex.validate(school));

    }
}

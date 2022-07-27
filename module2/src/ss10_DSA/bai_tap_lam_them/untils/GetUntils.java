package ss10_DSA.bai_tap_lam_them.untils;

import java.util.Scanner;

public class GetUntils {
    static Scanner scanner = new Scanner(System.in);

    public static String getDateOfBirth() {
        do {
            System.out.println("Nhập ngày tháng năm sinh ");
            String str = scanner.nextLine();
            if (Regex.checkDate(str)) {
                return str;
            } else {
                System.out.println("Ngày sinh bạn nhập chưa đúng");
            }
        } while (true);
    }

}

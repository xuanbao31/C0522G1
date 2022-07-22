package ss14_Exception_Debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleTest triangleTest = null;
        boolean check;
        do {
            System.out.println("Nhập cạnh a");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập cạnh b");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập cạnh c");
            double c = Double.parseDouble(scanner.nextLine());
            triangleTest = new TriangleTest(a, b, c);
            try {
                if (a + b <= c || a + c <= b || b + c <= a) {
                    throw new TriangleException("Đây không phải là 3 cạnh của 1 tam giác");
                } else {
                    System.out.println("Đây là 3 cạnh của tam giác");
                    break;
                }

            } catch (Exception e) {
                e.printStackTrace();
                check = true;
            }


        } while (check);
        System.out.println(triangleTest);


    }
}
